package OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex006Car.Test;

import OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex006Car.Domain.Car;
import java.util.Scanner;

public class CarTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car[] cars = new Car[3];

        System.out.println("---------- Registrar Carros ----------");

        for (int i = 0; i < cars.length; i++){
            cars[i] = new Car();

            System.out.print("Marca do Carro: ");
            cars[i].brand = input.nextLine().trim();

            while (!cars[i].brand.matches("[a-zA-ZÀ-ÿ]{2,}(\\s[a-zA-ZÀ-ÿ]+)*")){
                System.out.print("Entrada inválida! Marca do carro: ");
                cars[i].brand = input.nextLine().trim();
            }

            System.out.print("Modelo do Carro: ");
            cars[i].model = input.nextLine().trim();

            while (!cars[i].model.matches("[a-zA-ZÀ-ÿ0-9]{2,}(\\s[a-zA-ZÀ-ÿ0-9]+)*")){
                System.out.print("Entrada inválida! Modelo do Carro: ");
                cars[i].model = input.nextLine().trim();
            }

            System.out.print("Ano de lançamento: ");
            cars[i].year = input.nextLine().trim();

            while (!cars[i].year.matches("[0-9]+") || Integer.parseInt(cars[i].year) < 1886){
                System.out.print("Entrada inválida! Ano de lançamento: ");
                cars[i].year = input.nextLine().trim();
            }

            if (i != cars.length - 1) {
                System.out.println("------------------------------");
            }

        }
        System.out.println();
        System.out.println("---------- Dados dos Carros ----------");
        for (int i = 0; i < cars.length; i++){
            System.out.println("Marca do Carro: " + cars[i].brand);
            System.out.println("Modelo do Carro: " + cars[i].model);
            System.out.println("Ano do Carro: " + cars[i].year);

            if (i != cars.length - 1){
                System.out.println("------------------------------");
            }

        }

    }
}
