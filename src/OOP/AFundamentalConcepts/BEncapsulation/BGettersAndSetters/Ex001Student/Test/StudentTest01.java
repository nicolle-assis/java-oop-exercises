package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex001Student.Test;

import OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex001Student.Domain.Student;
import java.util.Scanner;

public class StudentTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.println("---------- Nota do(a) Estudante ----------");
        System.out.print("Nome: ");
        student.setName(input.nextLine());

        System.out.print("Nota final: ");
        student.setGrade(input.nextDouble());

    }
}
