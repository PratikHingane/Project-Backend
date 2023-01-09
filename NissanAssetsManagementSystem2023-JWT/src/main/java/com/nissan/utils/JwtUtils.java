package com.nissan.utils;

import java.util.Date;
import org.springframework.stereotype.Component;
import com.nissan.common.AccessDeniedException;
import com.nissan.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {
	
	//Secret Key
	private static String secret="This_is_Nissan";
	
	//Expiration Time
	private static long expiryDuration=60*60;
	
	//Generate Token : header.paylod.signature
	public String generateJwt(User user) {
		long milliTime=System.currentTimeMillis();
		long expiryTime=milliTime+expiryDuration*1000;
		
		//Set IssuedTime and ExpiryTime
		Date issuedAt=new Date(milliTime);
		System.out.println(issuedAt);
		Date expiryAt=new Date(expiryTime);
		System.out.println(expiryAt);
		
		//Claims
		Claims claims=Jwts.claims().setIssuer(user.getuId().toString())
				.setIssuedAt(issuedAt)
				.setExpiration(expiryAt);
		
		//generate jwt using claims
		return Jwts.builder().setClaims(claims)
		.signWith(SignatureAlgorithm.HS512,secret)
		.compact();
		
	}
	
	//AccessDenied for Claims -- User-Define Exception
	public Claims verify(String authorization) throws Exception{
		
		//Authorization :
		try {
			Claims claims=Jwts.parser().setSigningKey(secret)
					.parseClaimsJws(authorization).getBody();
			return claims;
			
		}catch(Exception e) {
			throw new AccessDeniedException("Sorry! Access Denied");
		}
	}
}
