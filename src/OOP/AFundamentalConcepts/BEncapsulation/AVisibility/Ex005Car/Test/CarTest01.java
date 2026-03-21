package OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex005Car.Test;

import OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex005Car.Domain.Car;
import java.util.Scanner;

public class CarTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car = new Car();

        System.out.println("Velocidade atual do seu carro: " + car.getCurrentSpeed() + " Km/hr");

        System.out.print("Deseja aumentar a velocidade? ");
        car.setAnswer(input.nextLine().toUpperCase().trim().substring(0,1));

        while (true) {
            car.increaseSpeed();
            car.display();

            System.out.print("Deseja aumentar a velocidade? ");
            car.setAnswer(input.nextLine().toUpperCase().trim().substring(0,1));

            if (!car.getAnswer().equals("S")) break;
        }
    }
}
