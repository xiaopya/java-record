package com.itxiaopy;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.itxiaopy.utils.Jwt;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class TliasWebManagementApplicationTests {

	@Test
	 void testGenerateJwtToken() {
		try {
			Map<String,Object> claims = new HashMap<>();
			claims.put("id", "1");
			claims.put("username", "陈家堡");
			String token = Jwt.generateJwtToken(claims);
			System.out.println(token);
		} catch (JWTCreationException e) {
			throw new RuntimeException("error generating JWT token", e);
		}
	}

	@Test
	 void testDecodeJwtToken() {
		try {
			String tokenToDecode = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJhdXRoMCIsImlkIjoiMSIsInVzZXJuYW1lIjoi6ZmI5a625aChIiwiZXhwIjoxNzA3NDYwOTg1fQ.BkQTNy4xCzfvXluoeo9Oq12vwmWyo57QZNvqkOCZdwc";
			Map<String, Claim> claimMap= Jwt.decodeJwtToken(tokenToDecode);
			System.out.println(claimMap.get("id"));
		} catch (JWTVerificationException e) {
			// 处理解码失败的情况
			System.out.println("Token Verification Failed: " + e.getMessage());
			e.printStackTrace();
		}
    }

}
