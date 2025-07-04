package gt.com.alodev.refactor.util;


import gt.com.alodev.refactor.models.Order;

import java.util.ArrayList;

public class ReportGenerator {

    public ArrayList<String> printOrderSummary(Order order) {
        var report = new ArrayList<String>();
        report.add(this.printHeader(order.customerName()));
        for (String item : order.items()) {
        report.add(this.printLineItem(item));
        }
        report.add(this.printTotal(order.total()));
        return report;
    }

    private String printHeader(String customer) {
        return "Order for: " + customer;
    }

    private String printLineItem(String item) {
        return " - Item: " + item;
    }

    private String printTotal(double total){
        return "Total: $" + total;
    }
}