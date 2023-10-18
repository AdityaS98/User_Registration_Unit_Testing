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

    public boolean emailValidation(String email) throws UserRegistrationException {
        if (Pattern.matches("[a][b][c][.][a-z]{1,10}[@][b][l][.][c][o][.][a-z]{1,10}", email)) {
            return true;
        } else {
            throw new UserRegistrationException("You have entered wrong Email");
        }

    }


}
