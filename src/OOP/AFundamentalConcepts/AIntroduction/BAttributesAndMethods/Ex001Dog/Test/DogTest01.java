package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex001Dog.Test;

import OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex001Dog.Domain.Dog;
import java.util.Scanner;

public class DogTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dog dog = new Dog();

        System.out.print("Nome do cachorro: ");
        dog.name = input.nextLine();

        System.out.print("Raça do cachorro: ");
        dog.Breed = input.nextLine();

        dog.bark();
    }
}
