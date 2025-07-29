package za.ac.cput.domain;

public class User {

    private String userName;
    private String userId;
    private String email;
    private String PhoneNumber;
    private String passwordHash;
    private String profilePicture;
    private boolean isVerified;
    private String language;


    private User() {

    }

    public User(Builder builder) {
        this.userName = builder.userName;
        this.userId = builder.userId;
        this.email = builder.email;
        this.PhoneNumber = builder.PhoneNumber;
        this.passwordHash = builder.passwordHash;
        this.profilePicture = builder.profilePicture;
        this.isVerified = builder.isVerified;
        this.language = builder.language;
    }


    public String getUsername() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }


    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", isVerified=" + isVerified +
                ", language='" + language + '\'' +
                '}';
    }

    public static class Builder {
        private String userName;
        private String userId;
        private String email;
        private String PhoneNumber;
        private String passwordHash;
        private String profilePicture;
        private boolean isVerified;
        private String language;

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.PhoneNumber = phoneNumber;
            return this;
        }

        public Builder setPasswordHash(String passwordHash) {
            this.passwordHash = passwordHash;
            return this;

        }

        public Builder setProfilePicture(String profilePicture) {
            this.profilePicture = profilePicture;
            return this;
        }

        public Builder setIsVerified(boolean isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder copy(User user) {
            this.userName = user.userName;
            this.userId = user.userId;
            this.email = user.email;
            this.PhoneNumber = user.PhoneNumber;
            this.passwordHash = user.passwordHash;
            this.profilePicture = user.profilePicture;
            this.isVerified = user.isVerified;
            this.language = user.language;
            return this;

        }
        public User build() {
            return new User(this);

        }

    }
}
