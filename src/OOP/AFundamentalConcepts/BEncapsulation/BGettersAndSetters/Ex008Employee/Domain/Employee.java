package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex008Employee.Domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private LocalDate hiringDate;
    private DateTimeFormatter formatter;

    {
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        hiringDate = LocalDate.now();
    }

    public Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getFormatedSalary(){
        return String.format("R$ %,.2f", salary);
    }

    public String employeeStatus(){
        if (salary <= 1000) { return "Junior"; }
        else if (salary <= 5000) { return "Pleno"; }
        else return "Sênior";
    }

    public void display(){
        System.out.println("---------- Registro de Funcionário ----------");
        System.out.printf("Nome: %s%n", name);
        System.out.printf("Departamento: %s%n", department);
        System.out.printf("Salário: %s%n", getFormatedSalary());
        System.out.printf("Status: %s%n", employeeStatus());
        System.out.printf("Data de contratação: %s%n", hiringDate.format(formatter));
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public LocalDate getHiringDate() { return  hiringDate; }
    public void setHiringDate(LocalDate hiringDate) { this.hiringDate = hiringDate; }
}
