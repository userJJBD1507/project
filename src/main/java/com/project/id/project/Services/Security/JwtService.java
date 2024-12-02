package com.project.id.project.Services.Security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.function.Function;

@Service
public class JwtService {
    private static final String SECRET_KEY = "404E635266556A586E3272357538782F413F4428472B4B625864536756685978";
    public String generateToken(UserDetails userDetails) {
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000*24*60))
                .signWith(getSigning(), SignatureAlgorithm.HS256)
                .compact();
    }
    public Key getSigning() {
        byte[] arrayOfData = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(arrayOfData);
    }
    public Claims extractAllClaims(String token) {
        return Jwts.parser()
                .setSigningKey(getSigning())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }
    public Date extractDate(String token) {
        return extractClaim(token, Claims::getExpiration);
    }
    public boolean isExpired(String token) {
        return extractDate(token).before(new Date());
    }
    public boolean isValid(String token, UserDetails userDetails) {
        return extractUsername(token).equals(userDetails.getUsername()) && !isExpired(token);
    }
}