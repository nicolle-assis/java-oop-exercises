package OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex002Product.Domain;

public class Product {
    private String name;
    private double price;

    public void display(){
        System.out.println("---------- Estoque de produto ----------");
        System.out.println("Nome: " + this.name);
        System.out.printf("Preço: R$ %.2f%n", this.price);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
