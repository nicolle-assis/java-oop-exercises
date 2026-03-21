package OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex004Employee.Domain;

public class Employee {
    private String name;
    private String role;
    private String department;
    private double salary;
    private String answer;
    private double increaseRate;

    public void display(){
        System.out.println("---------- Dados do(a) funcionário(a) ----------");
        System.out.println("Nome: " + this.name);
        System.out.println("Cargo: " + this.role);
        System.out.println("Setor: " + this.department);
        System.out.printf("Salário: R$ %.2f%n", this.salary);
        System.out.println("---------------------------------------------");
    }

    public void increaseSalary(){
        salary = salary + (salary * increaseRate / 100);
    }

    public void setName(String name){
        if (!name.matches("[a-zA-ZÀ-ÿ ]+")){
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setRole(String role){
        if (!role.matches("[a-zA-ZÀ-ÿ ]+")){
            throw new IllegalArgumentException("Cargo inválido!");
        }
        this.role = role;
    }

    public String getRole(){
        return role;
    }

    public void setDepartment(String department){
        if (!department.matches("[a-zA-ZÀ-ÿ ]+")){
            throw new IllegalArgumentException("Departamento inválido!");
        }
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setSalary(double salary){
        if (salary <= 0){
            throw new IllegalArgumentException("Entrada inválida!");
        }
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setIncreaseRate(double increaseRate){
        if (increaseRate <= 0){
            throw new IllegalArgumentException("Porcentagem inválida");
        }
        this.increaseRate = increaseRate;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return answer;
    }
}
