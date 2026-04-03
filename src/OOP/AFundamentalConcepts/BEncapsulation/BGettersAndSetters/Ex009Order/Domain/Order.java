package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex009Order.Domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    private String customerName;
    private String product;
    private int quantity;
    private double  unitPrice;
    private double totalPrice;
    private LocalDate orderDate;
    private DateTimeFormatter formatter;

    {
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        orderDate = LocalDate.now();
    }

    public Order(String customerName, String product, int quantity, double unitPrice){
        this.customerName = customerName;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = quantity * unitPrice;
    }

    public String getFormatedUnitPrice(){
        return String.format("R$ %,.2f", unitPrice);
    }

    public String getFormatedTotalPrice(){
        return String.format("R$ %,.2f", totalPrice);
    }

    public void display(){
        System.out.println("---------- Dados do Pedido ----------");
        System.out.printf("Nome do cliente: %s%n", customerName);
        System.out.printf("Produto: %s%n", product);
        System.out.printf("Quantidade: %d%n", quantity);
        System.out.printf("Preço unitário: %s%n", getFormatedUnitPrice());
        System.out.printf("Preço total: %s%n", getFormatedTotalPrice());
        System.out.printf("\nData: %s%n", orderDate.format(formatter));
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    public double getTotalPrice() { return totalPrice; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }
}
