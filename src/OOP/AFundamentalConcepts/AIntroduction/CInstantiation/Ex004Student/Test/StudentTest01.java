package OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex004Student.Test;

import OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex004Student.Domain.Student;
import java.util.Scanner;

public class StudentTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[4];

        System.out.println("---------- Notas dos Alunos ----------");
        for (int i = 0; i < students.length; i++){
            students[i] = new Student();

            System.out.print("Nome do(a) estudante: ");
            students[i].name = input.nextLine().trim();

            while (!students[i].name.matches("[a-zA-ZÀ-ÿ]{2,}(\\s[a-zA-ZÀ-ÿ]+)*")){
                System.out.print("Entrada inválida! Nome do(a) estudante: ");
                students[i].name = input.nextLine().trim();
            }

            for (int j = 0; j < 4; j++) {
                System.out.printf("Nota do %dº Bimestre: ", j + 1);

                while (!input.hasNextDouble()) {
                    input.nextLine();
                    System.out.print("Entrada inválida! Nome do(a) estudante: ");

                }
                students[i].grade = input.nextDouble();
                input.nextLine();

                while (students[i].grade < 0) {
                    System.out.print("Entrada inválida! Nome do(a) estudante: ");

                    while (!input.hasNextDouble()) {
                        input.nextLine();
                        System.out.print("Entrada inválida! Nome do(a) estudante: ");

                    }
                    students[i].grade = input.nextDouble();
                    input.nextLine();
                }
                students[i].sum += students[i].grade;
            }
            students[i].average = students[i].sum / students.length;

            if (i != students.length - 1) {
                System.out.println("------------------------------");
            }

        }

        System.out.println("---------- Média de nota ----------");
        for (Student student : students) {
            System.out.printf("A(O) aluna(o) %s teve uma nota máxima de %.1f%n", student.name, student.average);
        }

    }
}
