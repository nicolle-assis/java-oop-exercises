package OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex005BankAccount.Test;

import OOP.AFundamentalConcepts.AIntroduction.CInstantiation.Ex005BankAccount.Domain.BankAccount;
import java.util.Scanner;

public class BankAccountTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount[] bankAccounts = new BankAccount[3];

        System.out.println("---------- Conta Bancaria ----------");

        for (int i = 0; i < bankAccounts.length; i++){
            bankAccounts[i] = new BankAccount();

            System.out.print("Titular: ");
            bankAccounts[i].accountHolder = input.nextLine().trim();

            while (!bankAccounts[i].accountHolder.matches("[a-zA-ZÀ-ÿ]{2,}(\\s[a-zA-ZÀ-ÿ]+)*")){
                System.out.print("Entrada inválida! Titular: ");
                bankAccounts[i].accountHolder = input.nextLine().trim();
            }

            System.out.print("Número da Conta: ");
            bankAccounts[i].accountNumber = input.nextLine().trim();

            while (bankAccounts[i].accountNumber.length() != 11 || !bankAccounts[i].accountNumber.matches("[0-9]+")){
                System.out.print("Entrada inválida! Insira exatamente os 11 números da sua conta: ");
                bankAccounts[i].accountNumber = input.nextLine().trim();
            }

            System.out.print("Saldo bancário: ");
            bankAccounts[i].balance = input.nextDouble();
            input.nextLine();

            while (bankAccounts[i].balance < 0){
                System.out.print("Entrada inválida! Digite apenas números positivos: ");
                bankAccounts[i].balance = input.nextDouble();
                input.nextLine();
            }

            if (i != bankAccounts.length - 1){
                System.out.println("------------------------------");
            }

        }
        System.out.println();
        System.out.println("---------- Contas Bancárias ----------");

        for (int i = 0; i < bankAccounts.length; i++){
            System.out.println("Titular: " + bankAccounts[i].accountHolder);
            System.out.println("Número da Conta: " + bankAccounts[i].accountNumber.substring(0,10) + "-" + bankAccounts[i].accountNumber.substring(10,11));
            System.out.printf("Saldo na Conta: R$ %.2f%n", bankAccounts[i].balance);

            if (i != bankAccounts.length - 1){
                System.out.println("------------------------------");
            }
        }
    }
}
