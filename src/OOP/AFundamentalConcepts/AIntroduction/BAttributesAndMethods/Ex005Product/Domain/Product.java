package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex005Product.Domain;

public class Product {
    public double price;
    public double discount;
    public double finalPrice;

    public void calculateDiscount(){
        finalPrice = price - (price * discount / 100);
        System.out.println("Preço final: R$" + finalPrice);
    }
}
