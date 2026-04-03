package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex009Order.Test;

import OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex009Order.Domain.Order;

public class OrderTest01 {
    public static void main(String[] args) {
        Order order = new Order("Rafael Mendes", "Notebook Dell Inspiron", 2, 3799.99);
        order.display();
    }
}
