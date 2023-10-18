package com.bridgelabs.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class UserRegistrationTest {


    UserRegistration obj = new UserRegistration();

    @Test
    public void testForFirstNameValidation() throws UserRegistrationException {

        boolean b1 = obj.firstNameValidation("Aditya");
        // boolean b2 = obj.firstNameValidation("aditya");
        Assertions.assertTrue(b1);
        //Assertions.assertFalse(b2);

    }


    @Test

    public void testForLastNameValidation() throws UserRegistrationException {

        boolean b1 = obj.lastNameValidation("Sharma");
        //  boolean b2 = obj.lastNameValidation("sharma");
        Assertions.assertTrue(b1);
        // Assertions.assertFalse(b2);

    }

    @Test
    public void testForEmailValidation() throws UserRegistrationException {
        boolean b1 = obj.emailValidation("abc.xyz@bl.co.in");
        boolean b2 = obj.emailValidation("aditya@gmail.com");
        Assertions.assertTrue(b1);
        Assertions.assertFalse(b2);
    }

    @Test
    public void testForMobileValidation() {

        boolean b1 = obj.mobileNumberValidation("918887613856");
        boolean b2 = obj.mobileNumberValidation("9795992894");
        Assertions.assertTrue(b1);
        Assertions.assertFalse(b2);

    }

    @Test

    public void testforpassword() {
        boolean b1 = obj.passWordValidation("AdityaSharma@2806");
        boolean b2 = obj.passWordValidation("adityasharma");
        Assertions.assertFalse(b2);
        Assertions.assertTrue(b1);
    }

    @ParameterizedTest
    @CsvSource({
            "abc@yahoo.com,true",
            "abc-100@yahoo.com,false",
            "abc.100@yahoo.com,false",
            "abc111@abc.com,false",
            "abc-100@abc.net,false",
            "abc.100@abc.com.au,false",
            "abc@1.com,false",
            "abc@gmail.com.com,false",
            "abc+100@gmail.com,false"})
    void testEmailValidation(String emailAddress) {
        boolean isValid = obj.validEmail(emailAddress);
        Assertions.assertTrue(isValid);
    }

    @ParameterizedTest
    @CsvSource({"abc", "@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
            ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc..2002@gmail.com",
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})
    void testInvalidEmail(String email) {
        boolean isInvalid = obj.validEmail(email);
        Assertions.assertFalse(isInvalid);
    }


}
