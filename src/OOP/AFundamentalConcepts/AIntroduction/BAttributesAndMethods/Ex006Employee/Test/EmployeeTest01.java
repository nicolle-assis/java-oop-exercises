package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex006Employee.Test;

import OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex006Employee.Domain.Employee;
import java.util.Scanner;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Nome do(a) funcionário(a): ");
        employee.name = input.nextLine();

        System.out.print("Função do(a) funcionário(a): ");
        employee.employeeRole = input.nextLine();

        System.out.print("Salário atual: R$");
        employee.currentSalary = input.nextDouble();

        System.out.print("Porcentagem de aumento: ");
        employee.increasePercentage = input.nextDouble();

        employee.salaryAdjustment();

    }
}
