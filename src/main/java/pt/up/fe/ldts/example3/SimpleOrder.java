package pt.up.fe.ldts.example3;

import java.util.Objects;

public class SimpleOrder {
    private Discount discount;
    private final double price;

    public SimpleOrder(double price) {
        this.price = price;
        this.discount = new NoDiscount();
    }

    public void setDiscount(Discount discount) {
        this.discount = Objects.requireNonNullElseGet(discount, NoDiscount::new);
    }
    public double getTotal() {return discount.applyDiscount(price);}
}
