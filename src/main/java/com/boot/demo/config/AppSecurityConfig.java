package com.boot.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login", "/oauth_login").permitAll().and().authorizeRequests()
				.anyRequest().authenticated().and().oauth2Login().loginPage("/oauth_login")
				.defaultSuccessUrl("/loginSuccess").failureUrl("/loginFailure");
	}

}
