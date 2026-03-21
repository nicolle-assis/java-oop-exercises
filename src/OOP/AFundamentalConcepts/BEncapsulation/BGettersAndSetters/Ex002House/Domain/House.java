package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex002House.Domain;
import java.util.Locale;

public class House {
    private double price;
    private String address;

    public void display(){
        System.out.println("---------- Anuncio de Casa ----------");
        System.out.println("Endereço: " + this.address);
        System.out.printf(new Locale("pt","BR"), "Preço: R$ %,.2f%n", this.price);
        System.out.println("  *   _-----_   * ");
        System.out.println("__|__  | A |  __|__");
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price <= 0) throw new IllegalArgumentException("Preço inválido");
        this.price = price;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
