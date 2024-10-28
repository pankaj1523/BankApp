package Bank.application;

public class Main {
    public static void main(String[] args) {

        SBI.reteOfInterest = 6;
        HDFCBank.reteOfInterest = 7;

        SBI Account1 = new SBI(100000, "123", "dev");
        SBI Account2 = new SBI(250000, "456", "Rakshit");

        HDFCBank Account3 = new HDFCBank(150000, "789", "meher");

        int balance = Account1.checkBalance("124");
        System.out.println("The balance for account1 is" + balance);

        int balanceCheck = Account1.checkBalance("123");
        System.out.println("The balance for account1 is : " + balanceCheck);


        String Massage = Account2.addMoney(50000);
        System.out.println(Massage);

        String message = Account3.withdrawMoney(10000, "789");
        System.out.println(message);

        double interest = Account1.calculateTotalInterest(20);
        System.out.println("The total interest you will get: " + interest);

        double interest1 = Account2.calculateTotalInterest(10);
        System.out.println("The total interest you will get: " + interest1);

    }
}