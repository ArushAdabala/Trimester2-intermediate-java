package Suarez;

public class AccountClient {
    public static void main(String[] args) {
        AccountObject account1 = new AccountObject("Arush Adabala","Saving",500.00);
        AccountObject account2 = new AccountObject();
        account1.CheckBalance();
        account2.CheckBalance();

        account2.setName("Arush Adabala");
        account2.setType("Checking");
        account2.setBalance(600.00);
        account2.CheckBalance();

        account1.Fee();
        account2.Fee();

        account1.setBalance(-100.00);
        account1.Fee();
        account1.CheckBalance();

        account2.transfer(account1,500.00);
        account2.Fee();
        account2.CheckBalance();
        account1.Fee();
        account1.CheckBalance();

        System.out.println(account1.toString());
        System.out.println(account2.toString());




    }
}
