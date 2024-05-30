package com.a2.mock_api.dto;

import com.a2.mock_api.constants.ValidationConstants;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterOTPRequest {
    @NotEmpty(message = ValidationConstants.emailRequired)
    @Email(message = ValidationConstants.emailNotValid)
    private String email;


    @NotEmpty(message = ValidationConstants.otpRequired)
    private String otp;

}
