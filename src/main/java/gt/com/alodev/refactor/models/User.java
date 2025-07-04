package gt.com.alodev.refactor.models;

public record User(String name, String email, String phone, String address, String city, String zip) {
    public User {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }
}
