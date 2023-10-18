package com.bridgelabs.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstNameValidation(String firstName) throws UserRegistrationException {
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
            return true;
        } else {
            throw new UserRegistrationException("You have entered Wrong First Name");
        }
    }

    public boolean lastNameValidation(String lastname) throws UserRegistrationException {
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastname)) {
            return true;
        } else {
            throw new UserRegistrationException("You have entered Wrong Last Name");
        }
    }


}
