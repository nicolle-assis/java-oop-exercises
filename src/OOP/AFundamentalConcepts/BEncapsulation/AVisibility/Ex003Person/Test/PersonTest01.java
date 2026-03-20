package OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex003Person.Test;

import OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex003Person.Domain.Person;
import java.util.Scanner;

public class PersonTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Olá! Me informe o seu nome: ");
        person.setName(input.nextLine().trim());

        System.out.print("Me informe a sua idade: ");
        person.setAge(input.nextInt());
    }
}
