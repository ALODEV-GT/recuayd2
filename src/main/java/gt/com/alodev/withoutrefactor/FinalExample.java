package gt.com.alodev.withoutrefactor;

import java.util.ArrayList;
import java.util.List;

public class FinalExample {

    public List<String> processData(String input) {
        List<String> data = new ArrayList<>();
        String[] parts = input.split(",");
        for (String part : parts) {
            part = part.trim();
            if (!part.isEmpty()) {
                if (part.length() > 10) {
                    part = part.substring(0, 10);
                }
                if (part.matches("[a-zA-Z]+")) {
                    data.add(part.toUpperCase());
                }
            }
        }

       return data;
    }

    public String createUser(String name, String email, String phone,
                             String address, String city, String zip) {
        // Validation logic mixed with creation
        if (name == null || name.isEmpty()) {
            return "Name cannot be empty";
        }
        if (email == null || !email.contains("@")) {
            return "Invalid email";
        }
        // ... more validations

        return "User created: " + name;
    }

    public double calculateArea(String shape, double... dimensions) {
        return switch (shape) {
            case "circle" -> Math.PI * dimensions[0] * dimensions[0];
            case "rectangle" -> dimensions[0] * dimensions[1];
            case "triangle" -> dimensions[0] * dimensions[1] / 2;
            default -> throw new IllegalArgumentException("Unknown shape");
        };
    }
}