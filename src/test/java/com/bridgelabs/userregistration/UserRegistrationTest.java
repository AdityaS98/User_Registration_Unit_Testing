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

}
