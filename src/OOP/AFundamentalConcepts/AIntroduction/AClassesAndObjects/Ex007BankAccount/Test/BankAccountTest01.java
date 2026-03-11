package OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex007BankAccount.Test;

import OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex007BankAccount.Domain.BankAccount;
import java.util.Scanner;

public class BankAccountTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.println("Conta Bancária");
        System.out.print("Titular: ");
        bankAccount.accountHolder = input.nextLine();

        System.out.print("Número da conta:");
        bankAccount.numberAccount = input.nextLine();

        while (bankAccount.numberAccount.length() != 11){
            System.out.print("Número inválido: ");
            bankAccount.numberAccount = input.nextLine();
        }

        System.out.print("Valor do depósito: ");
        double amount = input.nextDouble();
        bankAccount.depositMoney(amount);

        System.out.println();
        System.out.println("---------- Conta bancária ----------");
        System.out.println("Titular: " + bankAccount.accountHolder);
        System.out.println("Número da conta: " + bankAccount.formatAccountNumber());
        System.out.printf("Saldo bancário: R$ %.2f%n", bankAccount.balance);
    }
}
