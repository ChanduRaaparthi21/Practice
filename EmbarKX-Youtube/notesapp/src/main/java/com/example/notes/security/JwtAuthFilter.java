package com.example.notes.security;
import jakarta.servlet.FilterChain; import jakarta.servlet.http.*;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import com.example.notes.service.CustomUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {
  private final JwtUtil jwtUtil; private final CustomUserDetailsService uds;
  public JwtAuthFilter(JwtUtil jwtUtil, CustomUserDetailsService uds){ this.jwtUtil = jwtUtil; this.uds = uds; }
  @Override
  protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws java.io.IOException, jakarta.servlet.ServletException {
    String h = req.getHeader("Authorization");
    if(h != null && h.startsWith("Bearer ")){
      String token = h.substring(7);
      if(jwtUtil.validateToken(token)){
        String username = jwtUtil.extractUsername(token);
        if(username != null && SecurityContextHolder.getContext().getAuthentication() == null){
          UserDetails ud = uds.loadUserByUsername(username);
          UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(ud, null, ud.getAuthorities());
          auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(req));
          SecurityContextHolder.getContext().setAuthentication(auth);
        }
      }
    }
    chain.doFilter(req,res);
  }
}
