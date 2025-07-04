package gt.com.alodev.refactor.models;

import java.util.List;

public record Order(String customerName, List<String> items, double total) {
}