package com.ishaan.news.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();

	}

	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/h2-console/**");
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeRequests(requests -> requests
                .antMatchers("/settings/**", "/list/**")
                .authenticated()
                .antMatchers("/")
                .permitAll())
                .formLogin(login -> login
                        .loginPage("/login"))
                .logout(logout -> logout
                        .deleteCookies("JSESSIONID"))
                .rememberMe(me -> me
                        .key("uniqueAndSecret"));
		return http.build();
	}
	/*
	 * @Bean public InMemoryUserDetailsManager userDetailsService() { UserDetails
	 * user = User.builder() .username("user") .password(encoder().encode("user"))
	 * .roles("USER") .build(); return new InMemoryUserDetailsManager(user); }
	 */

}
