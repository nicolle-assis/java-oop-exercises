package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex002PersonGreeting.Test;

import OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex002PersonGreeting.Domain.Person;
import java.util.Scanner;

public class PersonGreetingTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Me informe o seu nome: ");
        person.name = input.nextLine();

        System.out.print("Me informe a sua idade: ");
        person.age = input.nextInt();

        person.greeting();
    }
}
