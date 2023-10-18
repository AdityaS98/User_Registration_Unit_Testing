package com.bridgelabs.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

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


}
