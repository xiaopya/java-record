package com.itxiaopy;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class TliasWebManagementApplicationTests {

	private static final String SECRET_KEY = "xiaopy";
	private static final long EXPIRATION_TIME_MS = 3600000;

	@Test
	 void testGenerateJwtToken() {
		try {
			Map<String,Object> claims = new HashMap<>();
			claims.put("id", "1");
			claims.put("username", "陈家堡");
			Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
			// 设置有效时间
			Date expirationDate = new Date(System.currentTimeMillis() + EXPIRATION_TIME_MS);
			String token = JWT.create()
					.withIssuer("auth0")
					.withSubject(claims.toString())
					.withExpiresAt(expirationDate)
					.sign(algorithm);
			System.out.println(token);
		} catch (JWTCreationException e) {
			throw new RuntimeException("error generating JWT token", e);
		}
	}

	@Test
	 void testDecodeJwtToken() {
		try {
			String tokenToDecode = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJhdXRoMCIsInN1YiI6IntpZD0xLCB1c2VybmFtZT3pmYjlrrbloKF9IiwiZXhwIjoxNzA3MTM5MzM3fQ.KLaF_MvWUptXCAjg5HuIF5v7Ndj7x-sDJuQR_ZjMg9I";
			Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
			DecodedJWT decodedJWT = JWT.require(algorithm).build().verify(tokenToDecode);
			System.out.println("Issuer: " + decodedJWT.getIssuer());
			System.out.println("Subject: " + decodedJWT.getSubject());
		} catch (JWTVerificationException e) {
			// 处理解码失败的情况
			System.out.println("Token Verification Failed: " + e.getMessage());
			e.printStackTrace();
		}
    }

}
