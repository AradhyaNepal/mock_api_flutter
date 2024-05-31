package com.a2.mock_api.controller;

import com.a2.mock_api.dto.*;
import com.a2.mock_api.exception.CustomException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RequestMapping(value = "/api/v1/auth")
@RestController
@RequiredArgsConstructor
public class AuthController {

    @GetMapping(value = "/login-credentials")
    public ResponseEntity<List<String>> loginCredentials() {
        var loginCredentials = new ArrayList<String>();
        loginCredentials.add("Email: niraj@gmail.com,Password: Test@123,OTP: 12345");
        return new ResponseEntity<>(loginCredentials, HttpStatus.OK);
    }


    @PostMapping(value = "/login")
    public ResponseEntity<AuthenticationResponse> login(@Valid @RequestBody LoginRequest loginRequest) throws CustomException {
        if (!(loginRequest.getEmail().equals("niraj@gmail.com") && loginRequest.getPassword().equals("Test@123"))) {
            throw new CustomException("Password milena");
        }
        return new ResponseEntity<>(new AuthenticationResponse(
                "Login Successful",
                "Ham sab ka dai niraj dai",
                "Yo yo honey singer"
        ), HttpStatus.OK);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<AuthenticationResponse> register(@Valid @RequestBody RegisterRequest registerRequest) {
        return new ResponseEntity<>(new AuthenticationResponse(
                "Register Successful",
                "Ham sab ka dai niraj dai",
                "Yo yo honey singer"
        ), HttpStatus.OK);
    }

    @PostMapping(value = "/forgot-password")
    public ResponseEntity<String> forgotPassword(@Valid @RequestBody ForgotPasswordRequest forgotPasswordRequest) throws CustomException {
        if (!(forgotPasswordRequest.getEmail().equals("niraj@gmail.com"))) {
            throw new CustomException("Email Milena");
        }
        return new ResponseEntity<>("Your password is Test@123. Do not forgot it again.", HttpStatus.OK);
    }


    @PostMapping(value = "/verify-register-otp")
    public ResponseEntity<String> verifyRegisterOTP(@Valid @RequestBody RegisterOTPRequest registerRequest) throws CustomException {
        if (!(registerRequest.getEmail().equals("niraj@gmail.com") && registerRequest.getOtp().equals("12345"))) {
            throw new CustomException("OTP milena");
        }
        return new ResponseEntity<>("Successfully verified", HttpStatus.OK);
    }
}
