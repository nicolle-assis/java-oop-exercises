package OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex007BankAccount.Test;

import OOP.AFundamentalConcepts.BEncapsulation.BGettersAndSetters.Ex007BankAccount.Domain.BankAccount;

public class BankAccountTest01 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Michael Jackson", "12345678910", 10000);

        bankAccount.display();
    }
}
