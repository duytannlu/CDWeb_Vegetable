package com.example.demo.google;

public class GoogleLoginRequest {
    private String googleToken;

    public GoogleLoginRequest() {
    }

    public GoogleLoginRequest(String googleToken) {
        this.googleToken = googleToken;
    }

    public String getGoogleToken() {
        return googleToken;
    }

    public void setGoogleToken(String googleToken) {
        this.googleToken = googleToken;
    }
}
