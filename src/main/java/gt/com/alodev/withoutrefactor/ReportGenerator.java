package gt.com.alodev.withoutrefactor;

public class ReportGenerator {
    public String printHeader(String customer) {
        return "Order for: " + customer;
    }

    public String printLineItem(String item) {
        return " - Item: " + item;
    }

    public String printTotal(double total) {
        return "Total: $" + total;
    }
}