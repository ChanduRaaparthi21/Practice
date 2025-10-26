package com.chandu.fleet.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.chandu.fleet.service.EmployeeInfoUserDetailsService;
import com.chandu.fleet.service.JwtService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {

	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private EmployeeInfoUserDetailsService employeeInfoUserDetailsService;
	
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String token=null;
		String username=null;
		String header = request.getHeader("Authorization");
		if(null != header && header.startsWith("Bearer ")) {
			token = header.substring(7);
		username =	jwtService.extractUsername(token);
		}
		if(null!= username && 	SecurityContextHolder.getContext().getAuthentication()== null) {
		UserDetails userDetails =	employeeInfoUserDetailsService.loadUserByUsername(username);
		
		if(jwtService.validateToken(token, userDetails)) {
			UsernamePasswordAuthenticationToken token2 = new UsernamePasswordAuthenticationToken(userDetails,null, userDetails.getAuthorities());
			token2.setDetails(new WebAuthenticationDetails(request));
			SecurityContextHolder.getContext().setAuthentication(token2);
		}
		}
		filterChain.doFilter(request, response);
	}

}
