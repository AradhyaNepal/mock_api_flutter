package com.a2.mock_api.dto;


import com.a2.mock_api.constants.ValidationConstants;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginRequest {
    @NotEmpty(message = ValidationConstants.emailRequired)
    @Email(message = ValidationConstants.emailNotValid)
    private String email;

    @NotEmpty(message = ValidationConstants.passwordRequired)
    //You do not use password regex on login, because it allows old system migration from wrong password to correct one
    private String password;


}
