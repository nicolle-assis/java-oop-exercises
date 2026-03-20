package OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex004Employee.Test;

import OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex004Employee.Domain.Employee;
import java.util.Scanner;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("---------- Registro de Funcionário ----------");

        while (true) {
            System.out.print("Nome: ");
            try {
                employee.setName(input.nextLine().trim());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
                System.out.print("Cargo: ");
            try {
                employee.setRole(input.nextLine().trim());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            System.out.print("Setor: ");
            try {
                employee.setDepartment(input.nextLine().trim());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            System.out.print("Salário: R$ ");
            try {
                employee.setSalary(input.nextDouble());
                input.nextLine();
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }

        employee.display();
    }
}
