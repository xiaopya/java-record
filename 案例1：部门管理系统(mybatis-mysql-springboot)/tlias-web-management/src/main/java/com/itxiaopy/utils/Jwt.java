package com.itxiaopy.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.utils
 * @className: Jwt
 * @author: cyl
 * @description: TODO
 * @date: 2024/2/5 20:01
 * @version: 1.0
 */
public class Jwt {
    private static final String SECRET_KEY = "xiaopy";
    private static final long EXPIRATION_TIME_MS = 3600000;

    public static String generateJwtToken(String subject) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
            // 设置有效时间
            Date expirationDate = new Date(System.currentTimeMillis() + EXPIRATION_TIME_MS);
            return JWT.create()
                    .withIssuer("auth0")
                    .withSubject(subject)
                    .withExpiresAt(expirationDate)
                    .sign(algorithm);
        } catch (JWTCreationException e) {
            throw new RuntimeException("error generating JWT token", e);
        }
    }

    public static DecodedJWT decodeJwtToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
            return JWT.require(algorithm).build().verify(token);
        } catch (JWTVerificationException e) {
            // 处理解码失败的情况
            System.out.println("Token Verification Failed: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
