package com.a2.mock_api.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthenticationResponse {
    final String accessToken;
    final String refreshToken;
}
