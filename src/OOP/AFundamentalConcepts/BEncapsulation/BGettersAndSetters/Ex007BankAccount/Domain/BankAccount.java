package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex007BankAccount.Domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BankAccount {
    private String holderName;
    private String accountNumber;
    private double balance;
    private LocalDate creationDate;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public BankAccount(String holderName, String accountNumber, double balance){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creationDate = LocalDate.now();
    }

    public String getFormattedBalance(){
        return String.format(new Locale("pt", "BR"), "R$ %,.2f", balance);
    }

    public String getFormattedAccountNumber(){
        String formatter = accountNumber.replaceAll("[^0-9]", "");
        return formatter.replaceAll("(\\d{10})(\\d)", "$1-$2");
    }

    public boolean isPositiveBalance(){
        return balance > 0;
    }

    public void display(){
        System.out.println("---------- Dados da Conta ----------");
        System.out.printf("Titular: %s%n", holderName);
        System.out.printf("Número da conta: %s%n", getFormattedAccountNumber());
        System.out.printf("Data de criação da conta: %s%n", formatter.format(creationDate));

        if (isPositiveBalance()){ System.out.println("\nSaldo Positivo"); }
        else { System.out.println("\nSaldo negativo"); }

        System.out.printf("Saldo: %s%n", getFormattedBalance());
    }

    public String getHolderName(){ return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public LocalDate getCreationDate() { return creationDate; }
    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }

}
