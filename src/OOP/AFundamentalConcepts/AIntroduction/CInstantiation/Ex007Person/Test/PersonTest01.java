package OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex007Person.Test;

import OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex007Person.Domain.Person;
import java.util.Scanner;

public class PersonTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        System.out.print("Seu nome: ");
        person1.name = input.nextLine().trim();

        System.out.print("Nome da pessoa que você irá apresentar: ");
        person2.name = input.nextLine().trim();

        System.out.print("Idade da pessoa que você irá apresentar: ");
        person2.age = input.nextLine().trim();

        System.out.print("Lugar de onde essa pessoa veio: ");
        person2.address = input.nextLine().trim();

        System.out.print("Nome da terceira pessoa: ");
        person3.name = input.nextLine().trim();

        System.out.print("Lugar de onde essa pessoa é: ");
        person3.address = input.nextLine().trim();

        System.out.println();

        person1.greetingPerson1();
        person2.greetingPerson2();
        person3.greetingPerson3();
    }
}
