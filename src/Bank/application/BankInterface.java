package Bank.application;

public interface BankInterface {

    public int checkBalance(String password);
    public String addMoney(int money);
    public String withdrawMoney(int money,String password);
    public String changePassword(String oldPassword,String newPassword);
    public double calculateTotalInterest(int years);


}
