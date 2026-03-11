package OOP.AFundamentalConcepts.AIntroduction.AClassesAndObjects.Ex007BankAccount.Domain;

public class BankAccount {
    public String accountHolder;
    public double balance;
    public String numberAccount;

    public void depositMoney(double amount){
        balance += amount;
    }

    public String formatAccountNumber() {
        String formatted = numberAccount.substring(0,10) + "-" + numberAccount.substring(10);
        return formatted;
    }
}
