package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex005Product.Test;

import OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex005Product.Domain.Product;
import java.util.Scanner;

public class ProductTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product product = new Product();

        System.out.println("=== Calcule o Desconto ===");

        System.out.print("Preço: R$");
        product.price = input.nextDouble();

        System.out.print("Porcentagem do desconto: ");
        product.discount = input.nextDouble();

        product.calculateDiscount();
    }
}
