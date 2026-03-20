package OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex002Product.Test;

import OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex002Product.Domain.Product;
import java.util.Scanner;

public class ProductTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product product = new Product();

        System.out.println("---------- Registro de Produto ----------");
        System.out.print("Nome: ");
        String name = input.nextLine().trim();

        while (!name.matches("[a-zA-ZÀ-ÿ ]+")){
            System.out.print("Entrada inválida! Insira o nome do produto: ");
            name = input.nextLine().trim();
        }
        product.setName(name);

        double price = 0;
        boolean validPrice = false;

        while (!validPrice){
            System.out.print("Preço: R$ ");

            if (input.hasNextDouble()){
                price = input.nextDouble();
                if (price >= 0) validPrice = true;
                else System.out.println("Preço não pode ser negativo!");
            } else {
                System.out.println("Entrada inválida!");
            }
            input.nextLine();
        }
        product.setPrice(price);

        product.display();


        while (true) {
            System.out.println("------------------------------");
            System.out.print("Deseja alterar o preço do produto? ");
            String answer = input.nextLine().toUpperCase().trim().substring(0, 1);

            if (answer.equals("S")) {
                validPrice = false;

                while (!validPrice) {
                    System.out.print("Novo preço: R$ ");

                    if (input.hasNextDouble()){
                        price = input.nextDouble();

                        if (price >= 0) validPrice = true;
                        else System.out.println("Preço não pode ser negativo!");
                    } else {
                        System.out.println("Entrada inválida");
                    }
                    input.nextLine();
                }
                product.setPrice(price);
                product.display();

            } else {
                break;
            }
        }
    }
}
