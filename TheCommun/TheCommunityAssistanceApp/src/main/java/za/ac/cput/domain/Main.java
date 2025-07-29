package za.ac.cput.domain;

import za.ac.cput.factory.UserFactory;

public class Main {
    public static void main(String[] args, String profilePicture, String language, String phoneNumber) {


        User user1 = UserFactory.createUser("sabalo", "asd", "sabalo@gmail.com", "123453", language, profilePicture, phoneNumber);

        System.out.println(user1.toString());

    }
}
