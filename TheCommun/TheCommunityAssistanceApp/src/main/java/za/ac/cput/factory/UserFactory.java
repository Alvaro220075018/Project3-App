package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class UserFactory {
    public static User createUser(String userName,
                                  String passwordHash,
                                  String email,
                                  String userId,
                                  String language,
                                  String profilePicture,
                                  String phoneNumber) {


     {
            // Basic validations
            if (Helper.isNullOrEmpty(userId) ||
                    Helper.isNullOrEmpty(userName) ||
                    Helper.isNullOrEmpty(language) ||
                    !Helper.isValidEmail(email) ||
                    !Helper.isValidProfilePicture(profilePicture) ||
                    !Helper.isValidPhoneNumber(phoneNumber) ||

                    Helper.isNullOrEmpty(passwordHash)) {
                return null;
            }

            return new User.Builder()
                    .setUserId(userId)
                    .setUserName(userName)
                    .setUserId(userId)
                    .setEmail(email)
                    .setPhoneNumber(phoneNumber)
                    .setPasswordHash(passwordHash)
                    .build();
        }

    }
}






