package OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex004Book.Test;

import OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex004Book.Domain.Book;
import java.util.Scanner;

public class BookTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        System.out.println("---------- Registro de Livros ----------");
        System.out.print("Titulo do Livro: ");
        book1.title = input.nextLine();

        System.out.print("Autor(a): ");
        book1.author = input.nextLine();

        System.out.println("----------------------------------------");
        System.out.print("Titulo do livro: ");
        book2.title = input.nextLine();

        System.out.print("Autor(a): ");
        book2.author = input.nextLine();

        System.out.println("----------------------------------------");
        System.out.print("Titulo do livro: ");
        book3.title = input.nextLine();

        System.out.print("Autor(a): ");
        book3.author = input.nextLine();

        System.out.println("----------------------------------------");
        System.out.println("Autores(as) de cada livro");
        System.out.println(book1.author);
        System.out.println(book2.author);
        System.out.println(book3.author);


    }
}
