package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex003Calculator.Test;

import OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex003Calculator.Domain.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("----- Calculadora -----");
        System.out.print("Informe o valor de X: ");
        calculator.setX(input.nextDouble());

        System.out.print("Informe o valor de Y: ");
        calculator.setY(input.nextDouble());

        System.out.println("=== Informe a operação ===");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.println("[5] Cancelar");
        System.out.print("Opção: ");
        calculator.setOption(input.nextInt());

        switch (calculator.getOption()){
            case 1 -> calculator.printSum();
            case 2 -> calculator.printSub();
            case 3 -> calculator.printMulti();
            case 4 -> calculator.printDiv();
            case 5 -> System.out.println("Cancelando operação...");
            default -> System.out.println("Opção inválida!");
        }

        input.close();
    }
}
