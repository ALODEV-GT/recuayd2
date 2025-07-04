package gt.com.alodev.withoutrefactor;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<String> items;
    private double total;

    public Order(String customerName, List<String> items, double total) {
        this.customerName = customerName;
        this.items = items;
        this.total = total;
    }

    public ArrayList<String> printOrderSummary() {
        ArrayList<String> result = new ArrayList<>();
        ReportGenerator generator = new ReportGenerator();
        result.add(generator.printHeader(customerName));
        for (String item : items) {
            result.add(generator.printLineItem(item));
        }
        result.add(generator.printTotal(total));
        return result;
    }
}
