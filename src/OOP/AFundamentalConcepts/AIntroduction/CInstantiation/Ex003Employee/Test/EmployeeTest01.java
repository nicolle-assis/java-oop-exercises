package OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex003Employee.Test;

import OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex003Employee.Domain.Employee;
import java.util.Scanner;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        System.out.println("---------- Registro de Funcionários ----------");
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();

            System.out.print("Nome do(a) funcionário(a): ");
            employees[i].name = input.nextLine().trim();

            while (!employees[i].name.matches("[a-zA-ZÀ-ÿ]{2,}(\\s[a-zA-ZÀ-ÿ]+)*")){
                System.out.print("Entrada inválida! Nome do(a) funcionário(a): ");
                employees[i].name = input.nextLine().trim();
            }

            System.out.print("Cargo do(a) funcionário(a): ");
            employees[i].role = input.nextLine().trim();

            while (!employees[i].role.matches("[a-zA-ZÀ-ÿ]{2,}(\\s[a-zA-ZÀ-ÿ]+)*")){
                System.out.print("Entrada inválida! Cargo do(a) funcionário(a): ");
                employees[i].role = input.nextLine().trim();
            }

            System.out.print("Setor do(a) funcionário(a): ");
            employees[i].department = input.nextLine().trim();

            while (!employees[i].department.matches("[a-zA-ZÀ-ÿ]{2,}(\\s[a-zA-ZÀ-ÿ]+)*")){
                System.out.print("Entrada inválida! Setor do(a) funcionário(a): ");
                employees[i].department = input.nextLine().trim();
            }

            System.out.print("Salário: R$ ");

            while (!input.hasNextDouble()){
                input.nextLine();
                System.out.print("Entrada inválida! Salário: R$ ");
            }

            employees[i].salary = input.nextDouble();
            input.nextLine();

            while (employees[i].salary < 0){
                System.out.print("Entrada inválida! Salário: R$ ");

                while (!input.hasNextDouble()){
                    input.nextLine();
                    System.out.print("Entrada inválida! Salário: R$ ");
                }
                employees[i].salary = input.nextDouble();
                input.nextLine();
            }

            if (i != employees.length - 1) {
                System.out.println("-----------------------------------");
            }
        }

        System.out.println("---------- Funcionários ----------");
        for (int i = 0; i < employees.length; i++){
            System.out.println("Nome: " + employees[i].name);
            System.out.println("Função: " + employees[i].role);
            System.out.println("Setor: " + employees[i].department);
            System.out.printf("Salário R$ %.2f%n", employees[i].salary);

            if (i != employees.length - 1){
                System.out.println("------------------------------");
            }

        }

    }
}
