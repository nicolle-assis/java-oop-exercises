package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex007Person.Test;

import OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex007Person.Domain.Person;
import java.util.Scanner;

public class PersonTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println("---------- Dados ----------");
        System.out.print("Nome da 1º pessoa: ");
        person1.name = input.nextLine();

        System.out.print("Idade da 1º pessoa: ");
        person1.age = input.nextInt();
        input.nextLine();

        System.out.println("-----------------------------------");

        System.out.print("Nome da 2º pessoa: ");
        person2.name = input.nextLine();

        System.out.print("Idade da 2º pessoa: ");
        person2.age = input.nextInt();

        System.out.println("Comparando as idades......");

        if (person1.age > person2.age) {
            person1.olderPerson = person1.name;
            person1.compareAges();
        }
        else{
            person2.olderPerson = person2.name;
            person2.compareAges();
        }


    }
}
