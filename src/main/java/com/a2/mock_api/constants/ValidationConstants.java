package com.a2.mock_api.constants;

public class ValidationConstants {
    public static final String fullNameRequired ="Full name is Required";
    public static final String passwordRequired="Password is Required";
    public static final String passwordRegex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[\\sA-Za-z\\d@$!%*?&]+$";
    public static final String passwordRegexMessage="Password must have one upper case, one lower case, one symbol and one digit";
    public static final int passwordMinLength=8;
    public static final String passwordMinLengthMessage="Password must be 8 character long";
    public static final String emailNotValid="Please enter valid email";
    public static final String emailRequired="Email is Required";
    public static final String otpRequired="OTP is Required";

}
