package gt.com.alodev.refactor.util;

import java.util.ArrayList;
import java.util.List;

public class ImportData {
    public int processData(String input) {
        List<String> data = new ArrayList<>();
        String[] parts = input.split(",");
        for (String part : parts) {
            part = part.trim();

            final String partFormated = part.length() > 10 ?  part.substring(0, 10) : part;

            if (partFormated.matches("[a-zA-Z]+")) {
                data.add(partFormated.toUpperCase());
            }
        }

        System.out.println("Data processed:");
        for (String item : data) {
            System.out.println("- " + item);
        }

        System.out.println("Total items:");
        for (String item : data) {
            System.out.println("- " + item);
        }

        return data.size();
    }
}
