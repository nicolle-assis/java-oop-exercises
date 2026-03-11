package OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex005Student.Test01;

import OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex005Student.Domain.Student;
import java.util.Scanner;

public class StudentTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Nome do(a) aluno(a): ");
        student.name = input.nextLine();

        System.out.print("Primeira nota: ");
        student.grade1 = input.nextDouble();

        System.out.print("Segunda nota: ");
        student.grade2 = input.nextDouble();

        System.out.println("Média de nota: " + student.calculateAverage());
    }
}
