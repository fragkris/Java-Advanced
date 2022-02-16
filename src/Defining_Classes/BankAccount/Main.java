package Defining_Classes.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, BankAccount> accountsMap = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String output = null;
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if (command.equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                accountsMap.put(bankAccount.getId(), bankAccount);
                output = String.format("Account ID%d created", bankAccount.getId());
            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(tokens[1]);
                double amount = Double.parseDouble(tokens[2]);
                BankAccount bankAccount= accountsMap.get(id);
                output=executeIfNotNull(bankAccount, b-> {
                    b.deposit(amount);
                    return String.format("Deposited %.0f to ID%d",amount, id);
                });
            } else if (command.equals("SetInterest")) {
                BankAccount.setInterestRate(Double.parseDouble(tokens[1]));
            } else if (command.equals("GetInterest")) {
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);

                BankAccount bankAccount= accountsMap.get(id);
                output=executeIfNotNull(bankAccount, b-> {
                    double interest = b.getInterest(years);
                    return String.format("%.2f",interest);
                });


            }
            if (output!=null) {
                System.out.println(output);
            }
            input = scanner.nextLine();
        }
    }
    public static String executeIfNotNull(BankAccount account, Function<BankAccount, String>function){
        if (account==null){
            return "Account does not exist";
        }
        return function.apply(account);
    }
}
