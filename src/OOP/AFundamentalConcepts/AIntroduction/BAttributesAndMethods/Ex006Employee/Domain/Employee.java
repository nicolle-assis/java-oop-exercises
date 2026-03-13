package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex006Employee.Domain;

public class Employee {
    public String name;
    public String employeeRole;
    public double currentSalary;
    public double increasePercentage;
    public double adjustedSalary;

    public void salaryAdjustment(){
        adjustedSalary = currentSalary + (currentSalary * increasePercentage / 100);
        System.out.printf("Salário reajustado: R$ %.2f%n", adjustedSalary);
    }
}
