package Bank.application;

import java.util.UUID;

public class HDFCBank implements BankInterface{
    private int balance;
    private String accountNo;
    private String password;
    public String name;
    public static int reteOfInterest;

    public HDFCBank(int balance, String password, String name) {
        this.accountNo= UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;

    }

    @Override
    public int checkBalance(String password) {
        if (password==this.password){
            return balance;
        }
        return -1;
    }

    @Override
    public String addMoney(int money) {
        balance= balance+money;
        String massage = money +"have been added to the account" +accountNo+"the total balance is"+ balance;
        return massage;

    }

    @Override
    public String withdrawMoney(int money, String password) {
        if (password==this.password){
            if (money>balance){
                return "Insufficient balance";

            }else {
                balance = balance-money;
                return "Money withdraw successfully. Remaining balance is"+ balance;
            }
        }else {
            return "wrong password";
        }
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)){
            this.password=newPassword;
            return "Password has been updated";
        }else {
            return "wrong password";
        }
    }

    @Override
    public double calculateTotalInterest(int years) {
        double Interest = (balance*years*reteOfInterest)/100;
        return Interest;
    }
}
