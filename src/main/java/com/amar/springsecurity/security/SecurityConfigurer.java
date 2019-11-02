package com.amar.springsecurity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.amar.springsecurity.service.MyUserDetailsService;

public class SecurityConfigurer {

	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		//auth.userDetailsService(myUserDetailsService);
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable()
//		.authorizeRequests().antMatchers("/authenticate/").permitAll()
//		.anyRequest().authenticated();
//	}
}
