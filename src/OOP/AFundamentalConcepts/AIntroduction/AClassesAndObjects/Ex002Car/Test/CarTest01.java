package OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex002Car.Test;

import OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex002Car.Domain.Car;

import java.util.Scanner;

public class CarTest01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Car car = new Car();

        System.out.println("---------- Registro de Carros ----------");
        System.out.print("Informe a marca do carro: ");
        car.brand = input.nextLine();

        System.out.print("Modelo do carro: ");
        car.model = input.nextLine();

        System.out.println("Registro salvo...");
    }
}
