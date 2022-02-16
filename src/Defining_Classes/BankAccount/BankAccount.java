package Defining_Classes.BankAccount;

public class BankAccount {
    private static int accountNextId = 1;
    private int id;
    private static double interestRate = 0.02;
    private double balance;

    public BankAccount(){
        this.id= accountNextId;
        accountNextId++;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years) {
        return this.balance * interestRate * years;
    }

    public void deposit (double amount){
        this.balance+=amount;
    }

    public int getId() {
        return id;
    }
}
