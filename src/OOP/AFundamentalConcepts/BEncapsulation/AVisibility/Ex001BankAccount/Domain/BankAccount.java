package OOP.AFundamentalConcepts.BEncapsulation.AVisibility.Ex001BankAccount.Domain;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public void Display(){
        System.out.println("---------- Dados Bancários ----------");
        System.out.println("Titular: " + this.accountHolder);
        System.out.println("Número da conta: " + getAccountNumber());
        System.out.printf("Saldo: R$ %.2f%n", this.balance);
    }

    public void withdraw(double withdrawal){
        if (withdrawal > balance){
            System.out.println("Saldo insuficiente");
        }else {
            balance -= withdrawal;
        }
    }

    public void checkBalance(){
        System.out.printf("saldo na conta: R$ %.2f%n", this.balance);
    }

    public void deposit(double value){
        balance += value;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber.substring(0, 10) + "-" + accountNumber.substring(10);
    }
}
