package com.example.demo.model;

public class Properties {
    public static final String HEADER_STRING = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String SECRET = "8f821a74-367b-4741-95b6-fdfad9b44705"; //can be generated from uuid
    public static final long EXPIRATION_TIME = 31536000000L;
    public static final String FACEBOOK_AUTH_URL = "https://graph.facebook.com/me?fields=email,first_name,last_name&access_token=%s";
}
