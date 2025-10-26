package com.chandu.fleet.service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.lang.Function;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {

	public String generateToken(String username) {
		// TODO Auto-generated method stub
		
		Map<String, Object> claims = new HashMap<>();
		
		return createToken(claims, username);
	}

	private String createToken(Map<String, Object> claims, String username) {
		// TODO Auto-generated method stub
		
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(username)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+1000*60*60))
				.signWith(getSecKey(), SignatureAlgorithm.HS256).compact();
				
	}

	private Key getSecKey() {
		// TODO Auto-generated method stub
		byte[] keybytes= Decoders.BASE64.decode("a5b06ff07229987b07b6d7cd7a6a11d8b42ef21c5a72520c1685e048a7dea596");
		return Keys.hmacShaKeyFor(keybytes);
	}

	public String extractUsername(String token) {
		return extractClaim(token, Claims::getSubject);
	}

	public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
	


	private Claims extractAllClaims(String token) {
	    return Jwts.parser()  // ✅ Use `parser()` instead of `parserBuilder()`
	            .verifyWith((SecretKey) getSecKey()) // ✅ Cast `Key` to `SecretKey`
	            .build()
	            .parseSignedClaims(token)
	            .getPayload(); // ✅ Extract payload correctly
	}


	
	

    public Boolean validateToken(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        boolean flag = username.equals(userDetails.getUsername()) && !isTokenExpired(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
    
    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }
    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

}