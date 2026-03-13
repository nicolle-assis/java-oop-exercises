package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex003Car.Test;

import OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex003Car.Domain.Car;
import java.util.Scanner;

public class CarTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car = new Car();

        System.out.println("Velocidade inicial: 0 km/h");
        System.out.print("Acelerar o carro? [S/N] ");
        car.answer = input.nextLine().toUpperCase().substring(0, 1);

        if(car.speed == 0 && car.answer.equals("N")) return;

        car.accelerate();

        while(true){

            System.out.print("Acelerar o carro? [S/N] ");
            car.answer = input.nextLine().toUpperCase().substring(0, 1);

            if (car.answer.equals("S")){
                car.accelerate();
            }else if (car.answer.equals("N")){
                car.slowDown();
            }else{
                System.out.println("Dígito inválido");
                continue;
            }

            if (car.speed == 0){
                break;
            }
        }

    }
}
