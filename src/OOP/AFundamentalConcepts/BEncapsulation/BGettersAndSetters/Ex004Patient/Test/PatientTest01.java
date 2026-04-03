package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex004Patient.Test;

import OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex004Patient.Domain.Patient;
import java.util.Scanner;

public class PatientTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Patient patient = new Patient();

        System.out.println("O que deseja registrar? ");
        System.out.println("[1] - Nome");
        System.out.println("[2] - Nome e idade");
        System.out.println("[3] - Nome, idade e convênio");
        System.out.print("Opção: ");
        int option = input.nextInt();
        input.nextLine();

        if (option == 1){
            System.out.print("Nome do paciente: ");
            String name = input.nextLine();

            patient.registerPatient(name);

        } else if (option == 2){
            System.out.print("Nome do paciente: ");
            String name = input.nextLine();

            System.out.print("Idade do paciente: ");
            int age = input.nextInt();

            patient.registerPatient(name, age);

        } else if (option == 3) {
            System.out.print("Nome do paciente: ");
            String name = input.nextLine();

            System.out.print("Idade do paciente: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Convênio do paciente: ");
            String healthPlan = input.nextLine();

            System.out.println();
            patient.registerPatient(name, age, healthPlan);

        } else System.out.println("Opção inválida");

        input.close();

    }
}
