package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        if (s.isEmpty() || s == null)
            return true;
        return false;
    }

    public static boolean isValidEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        if (validator.isValid(email)) {
            return true;
        } else {
            return false;
        }
    }
    // Todo: isValidUserId method - 13 digits with range 1 to 9999

    public static boolean isValidUserId(short userId) {
        if (userId < 1 || userId > 9999) {
            return false;
        }
        return true;
    }

    // Todo: isValidPhone method - 1 to 10 digits

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            return false;
        }
        return true;
    }


    public static boolean isValidProfilePicture(String profilePicture) {
        if (profilePicture == null || profilePicture.isEmpty()) {
            return false;
        }
        return true;

        }
    }




