package OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex001Car.Test;

import OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex001Car.Domain.Car;
import java.util.Scanner;

public class CarTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car[] cars = new Car[3];

        System.out.println("---------- Carros ----------");

        for (int i = 0; i < cars.length; i++){
            cars[i] = new Car();

            System.out.print("Marca do carro: ");
            cars[i].brand = input.nextLine();

            System.out.print("Modelo do carro: ");
            cars[i].model = input.nextLine();

            System.out.print("Ano de lançamento: ");
            cars[i].year = input.nextInt();
            input.nextLine();

            if (i != cars.length - 1){
                System.out.println("------------------------------");
            }

        }

        System.out.println("---------- Lista de Carros ----------");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Carro " + (i + 1) + ": " + cars[i].brand + " " + cars[i].model + " " + cars[i].year);
        }

        input.close();
    }
}
