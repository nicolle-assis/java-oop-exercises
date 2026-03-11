package OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex003Product.Test;

import OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex003Product.Domain.Product;
import java.util.Scanner;

public class ProductTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        System.out.println("---------- Produtos ----------");
        System.out.print("Nome do 1º produto: ");
        product1.name = input.nextLine();

        System.out.print("Preço do produto: R$");
        product1.price = input.nextDouble();
        input.nextLine();

        System.out.println("------------------------------");
        System.out.print("Nome do 2º produto: ");
        product2.name = input.nextLine();

        System.out.print("Preço do produto: R$");
        product2.price = input.nextDouble();
        input.nextLine();

        System.out.println("------------------------------");
        System.out.print("Nome do 3º produto: ");
        product3.name = input.next();

        System.out.print("Preço do produto: R$");
        product3.price = input.nextDouble();
        input.nextLine();

        double totalPrice = product1.price + product2.price + product3.price;

        System.out.println("Valor total da compra: R$" + totalPrice);
    }
}
