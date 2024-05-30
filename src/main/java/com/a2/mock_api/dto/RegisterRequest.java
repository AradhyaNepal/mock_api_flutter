package com.a2.mock_api.dto;

import com.a2.mock_api.constants.ValidationConstants;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterRequest {
    @NotEmpty(message = ValidationConstants.fullNameRequired)
    private String fullName;

    @NotEmpty(message = ValidationConstants.passwordRequired)
    @Pattern(regexp = ValidationConstants.passwordRegex, message = ValidationConstants.passwordRegexMessage)
    @Size(min = ValidationConstants.passwordMinLength, message = ValidationConstants.passwordMinLengthMessage)
    private String password;

    @NotEmpty(message = ValidationConstants.emailRequired)
    @Email(message = ValidationConstants.emailNotValid)
    private String email;


}
