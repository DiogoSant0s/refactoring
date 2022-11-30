package pt.up.fe.ldts.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderLine> lines;
    public Order() {lines = new ArrayList<>();}
    public void add(Product product, int quantity) {lines.add(new OrderLine(product, quantity));}
    private double getTotal() {
        double total = 0;
        for (OrderLine line : lines)
            total += line.getTotal();
        return total;
    }
    public boolean isEligibleForFreeDelivery() {return getTotal() > 100;}
    public String printOrder() {
        StringBuilder printBuffer = new StringBuilder();
        for (OrderLine line : lines)
            printBuffer.append(line.getLineString());
        printBuffer.append("Total: ").append(getTotal());
        return printBuffer.toString();
    }
}