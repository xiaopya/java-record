package com.itxiaopy.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.Map;

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
private static final String SECRET = "xiaopy";
    // 签发者
    private static final String ISSUER = "auth0";
    // 过期时间，这里设置为60分钟
    private static final long EXPIRATION_TIME = 60 * 60 * 1000;

    // 生成JWT Token
    public static String generateJwtToken(Map<String, Object> claims) {
        return JWT.create()
                .withIssuer(ISSUER)
                .withPayload(claims)
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .sign(Algorithm.HMAC256(SECRET));
    }

    // 解码JWT Token
    public static Map<String, Claim> decodeJwtToken(String token) throws JWTVerificationException {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET))
                .withIssuer(ISSUER)
                .build();
        DecodedJWT jwt = verifier.verify(token);
        return jwt.getClaims();
    }
}
