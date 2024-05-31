package com.a2.mock_api.dto;


public record AuthenticationResponse(String message, String accessToken, String refreshToken) {
}
