package OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex004Calculator.Test;

import OOP.AFundamentalConcepts.AIntroduction.BAttributesAndMethods.Ex004Calculator.Domain.Calculator;
import java.util.Scanner;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("+-/*= Calculadora +-/*=");
        do {

            System.out.print("Insira o valor de x: ");
            calculator.x = input.nextDouble();

            System.out.print("Insira o valor de y: ");
            calculator.y = input.nextDouble();

            System.out.println("------------------------------");
            System.out.println("Escolha uma Operação");
            System.out.println("[1] Soma");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.print("Resposta: ");
            calculator.choice = input.nextInt();
            input.nextLine();

            System.out.println("==========");
            System.out.print("Resultado: ");

            switch (calculator.choice) {
                case 1 -> calculator.add();
                case 2 -> calculator.subtraction();
                case 3 -> calculator.multiplication();
                case 4 -> calculator.division();
                default -> System.out.println("Dígito inválido");
            }

            System.out.println("+-*/=+-*/=+-*/=+-*/=+-*/=+-*/=");

            System.out.print("Deseja fazer uma nova equação: [S/N] ");
            calculator.answer = input.nextLine().toUpperCase().substring(0, 1);

            System.out.println("+-*/=+-*/=+-*/=+-*/=+-*/=+-*/=");

        }while (calculator.answer.equals("S"));

    }
}
