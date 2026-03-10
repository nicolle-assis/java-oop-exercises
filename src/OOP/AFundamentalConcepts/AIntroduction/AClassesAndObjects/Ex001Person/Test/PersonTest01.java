package OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex001Person.Test;

import OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex001Person.Domain.Person;

import java.util.Scanner;

public class PersonTest01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Informe o seu nome: ");
        person.name  = input.nextLine();

        System.out.print("Informe a sua idade: ");
        person.age = input.nextInt();

        System.out.println("---------- Relatório ----------");
        System.out.println("Nome: "+ person.name);
        System.out.println("Idade: " + person.age);
    }
}
