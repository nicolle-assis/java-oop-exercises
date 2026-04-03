package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex006Patient.Domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient {
    private String name;
    private int age;
    private String cpf;
    private LocalDate admissionDate;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String getFormattedCpf() {
        String numbers = cpf.replaceAll("[^0-9]", "");
        return numbers.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    public Patient(String name, int age, String cpf, LocalDate admissionDate){
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.admissionDate = admissionDate;
    }

    public void display(){
        System.out.println("---------- Dados do Paciente ----------");
        System.out.printf("Nome: %s%n", name);
        System.out.printf("Idade: %d%n", age);
        System.out.printf("Cpf: %s%n", getFormattedCpf());
        System.out.printf("Data de internação: %s%n", admissionDate.format(formatter));
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public LocalDate getAdmissionDate(){
        return admissionDate;
    }
    public void setAdmissionDate(LocalDate admissionDate){ this.admissionDate = admissionDate; }

}
