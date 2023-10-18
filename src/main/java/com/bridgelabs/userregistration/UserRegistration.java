package com.bridgelabs.userregistration;

import java.util.regex.Matcher;
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

    public boolean mobileNumberValidation(String mobile) {
        return Pattern.matches("[1-9]{2}+[0-9]{10}", mobile);
    }

    public boolean passWordValidation(String password) {
        return Pattern.matches("(?=.*?[A-Z])(?=.*?[!@#$^&*.])(?=.*?[0-9])([a-zA-Z\\d@*#$&,.]){8,}", password);
    }

    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-z]{3}@[a-z]{2,}.[a-z]{3,}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        pattern = Pattern.compile("^[a-z]{3}-[0-9]{3}@[a-z]{3,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }

        pattern = Pattern.compile("^[a-z]{3}.[0-9]{3}@[a-z]{3,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        pattern = Pattern.compile("^[a-z0-9]{2,}@[a-z]{3}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        pattern = Pattern.compile("^[a-z]{2,}-[0-9]{2,}@[a-z]{2,}.[a-z]{2,}");
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        pattern = Pattern.compile("^[a-z]{3}.[0-9]{3}@[a-z]{3}.[a-z]{3}.[a-z]{2}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }

        pattern = Pattern.compile("^[a-z]{3}@[a-z]{2,}.[a-z]{3}.[a-z]{3}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        pattern = Pattern.compile("[a-z]{3,}[+]\\d{2,}@[a-z]{2,}.[a-z]{3,}");
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        pattern = Pattern.compile("^[a-z]{2,}@[0-9]{1,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }

        return false;


    }
}