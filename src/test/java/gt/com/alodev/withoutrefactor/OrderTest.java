package gt.com.alodev.withoutrefactor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class OrderTest {

    @Test
    public void shouldPrintOrderSummary() {
        var items = new ArrayList<String>();
        items.add("lapiz");
        items.add("hoja");
        var order = new Order("Alex",items, 5.0 );
        var result = order.printOrderSummary();

        var expected = new ArrayList<>();
        expected.add("Order for: Alex");
        expected.add(" - Item: lapiz");
        expected.add(" - Item: hoja");
        expected.add("Total: $5.0");

        Assertions.assertEquals(expected, result);

    }

}
