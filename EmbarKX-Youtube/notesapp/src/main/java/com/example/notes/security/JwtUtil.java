package com.example.notes.security;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {
  private final Key key;
  private final long expMs;
  public JwtUtil(@Value("${jwt.secret}") String secret, @Value("${jwt.expiration-ms}") long expMs){
    this.key = Keys.hmacShaKeyFor(secret.getBytes());
    this.expMs = expMs;
  }
  public String generateToken(String username, String role){
    Date now = new Date(); Date exp = new Date(now.getTime()+expMs);
    return Jwts.builder().setSubject(username).claim("role", role).setIssuedAt(now).setExpiration(exp).signWith(key).compact();
  }
  public String extractUsername(String token){
    return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody().getSubject();
  }
  public boolean validateToken(String token){
    try{ Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token); return true; }
    catch (JwtException ex){ return false; }
  }
}
