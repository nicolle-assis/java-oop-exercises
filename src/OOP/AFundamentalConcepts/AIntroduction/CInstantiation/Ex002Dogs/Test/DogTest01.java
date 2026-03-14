package OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex002Dogs.Test;

import OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex002Dogs.Domain.Dog;
import java.util.Scanner;

public class DogTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dog[] dogs = new Dog[2];

        System.out.println("---------- Cachorros ----------");
        for (int i = 0; i < dogs.length; i++){
            dogs[i] = new Dog();

            System.out.print("Nome do cachorro: ");
            dogs[i].name = input.nextLine();

            System.out.print("Raça do cachorro: ");
            dogs[i].breed = input.nextLine();

            System.out.print("Ano de nascimento do cachorro (yyyy): ");
            dogs[i].birthYear = input.nextInt();
            input.nextLine();

            if (i != dogs.length - 1){
                System.out.println("------------------------------");
            }
        }

        System.out.println("---------- Dados dos Cachorros ----------");
        for (int i = 0; i < dogs.length; i++){
            System.out.println("Cachorro "+ (i+1) +": " + dogs[i].name + " " + dogs[i].breed + " " + dogs[i].birthYear);
        }

        input.close();
    }
}
