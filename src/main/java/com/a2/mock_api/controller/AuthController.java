package com.a2.mock_api.controller;

import com.a2.mock_api.dto.AuthenticationResponse;
import com.a2.mock_api.dto.LoginRequest;
import com.a2.mock_api.dto.RegisterOTPRequest;
import com.a2.mock_api.dto.RegisterRequest;
import com.a2.mock_api.exception.CustomException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/api/v1/auth")
@RestController
@RequiredArgsConstructor
public class AuthController {
    //PasswordEncoder.encode
    //JwtService to create token
    //Authentication Manager.authenticate() new UsernamePasswordAuthenticationToken
//
    @PostMapping(value = "/login")
    public ResponseEntity<AuthenticationResponse> login(@Valid @RequestBody LoginRequest loginRequest) throws CustomException {
        if(!(loginRequest.getEmail().equals("niraj@gmail.com") && loginRequest.getPassword().equals("Test@123"))){
            throw new CustomException("Password milena");
        }
        return new ResponseEntity<>(new AuthenticationResponse(
                "Ham sab ka dai niraj dai",
                "Yo yo honey singer"
        ), HttpStatus.OK);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<AuthenticationResponse> register(@Valid @RequestBody RegisterRequest registerRequest) {
        return new ResponseEntity<>(new AuthenticationResponse(
                "Ham sab ka dai niraj dai",
                "Yo yo honey singer"
        ), HttpStatus.OK);
    }

    @PostMapping(value = "/verify-register-otp")
    public ResponseEntity<String> verifyRegisterOTP(@Valid @RequestBody RegisterOTPRequest registerRequest) {
        return new ResponseEntity<>(registerRequest.getEmail(), HttpStatus.OK);
    }
}
