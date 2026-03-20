package OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex001BankAccount.Test;

import OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex001BankAccount.Domain.BankAccount;

import java.util.Scanner;

public class BankAccountTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.println("---------- Conta Bancária ----------");
        System.out.print("Titular: ");
        String name = input.nextLine().trim();

        while (!name.matches("[a-zA-ZÀ-ÿ ]+")) {
            System.out.print("Entrada Inválida! Insira o seu Titular: ");
            name = input.nextLine().trim();
        }
        bankAccount.setAccountHolder(name);


        System.out.print("Número da Conta: ");
        String number = input.nextLine().trim();

        while (!number.matches("[0-9]{11}")) {
            System.out.print("Entrada inválida! Insira o número da sua conta: ");
            number = input.nextLine().trim();
        }
        bankAccount.setAccountNumber(number);

        System.out.println("[1] Depositar dinheiro");
        System.out.println("[2] Sacar dinheiro");
        System.out.println("[3] Consultar saldo");
        System.out.println("[4] Cancelar");
        System.out.print("Opção: ");
        int option = input.nextInt();

        while (option != 4) {

            if (option == 1) {
                System.out.print("Valor do depósito: R$ ");
                double value = input.nextDouble();
                bankAccount.deposit(value);

            } else if (option == 2) {
                System.out.print("Valor do saque: R$ ");
                double withdrawal = input.nextDouble();
                bankAccount.withdraw(withdrawal);

            } else if (option == 3) {
                bankAccount.checkBalance();

            } else {
                System.out.println("Digito inválido! Tente novamente");
            }

            System.out.println("------------------------------");

            System.out.println("[1] Depositar dinheiro");
            System.out.println("[2] Sacar dinheiro");
            System.out.println("[3] Consultar saldo");
            System.out.println("[4] Cancelar");
            System.out.print("Opção: ");
            option = input.nextInt();

        }

        bankAccount.Display();

    }
}
