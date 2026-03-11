package OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex006Employee.Test;

import OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex006Employee.Domain.Employee;
import java.util.Scanner;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Dados do(a) funcionário(a):");
        System.out.print("Nome: ");
        employee.name = input.nextLine();

        System.out.print("Salário: R$ ");
        employee.salary = input.nextDouble();

        System.out.printf("Salário anual: R$ %.2f%n", employee.annualSalary());
    }
}
