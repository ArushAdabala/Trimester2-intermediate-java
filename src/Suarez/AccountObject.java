package Suarez;
/*
Arush Adabala
3/22/2019
Creating a bank account object class
 */
import java.util.*;
public class AccountObject {
    Scanner input = new Scanner (System.in);
    private String name;
    private String type;
    private double balance;
    private int AccountNumber;

    public AccountObject() //Default constructor
    {
        System.out.println("Please type in your name");
        name = input.nextLine();
        System.out.println("Please type in whether you want to open a Savings or Checking account");
        type = input.next();
        balance = 0.00;
        AccountID.counter++;
        AccountNumber=AccountID.counter;

    }

    public AccountObject(String name1, String type1, double balance1) //Default constructor
    {
        name = name1;
        type = type1;
        balance = balance1;
        AccountID.counter++;
        AccountNumber=AccountID.counter;

    }

    public AccountObject setName(String name1) {

        this.name = name1;
        return this;

    }

    public AccountObject setType (String type1) {

        this.type = type1;
        return this;

    }

    public AccountObject setBalance(double balance1) {
        if(balance1 < 0){
            WithdrawalCheck(balance1);
        }
        this.balance = balance1;
        return this;


    }

    public String getName() {

        return name;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void WithdrawalCheck(double balance1){
        balance = balance1;
        System.out.println("You can't withdraw money you don't have.");
    }

    public void Fee(){
        if(balance <=200.00){
            if(balance-50 < 0){
                WithdrawalCheck(balance);
            }
            else {
            balance -=50.00;
            }
        }
    }

    public void CheckBalance(){
        if(balance == 0.00) {
            System.out.println("Your must have some money in your account. Please deposit some.");
        }

    }

    public void transfer(Object object1, double balance1){

        if(object1 instanceof AccountObject){
            AccountObject account = (AccountObject) object1;
            if(name.equals(account.name)){
                if(balance-balance1 < 0){
                    Withdrawal(balance);
                }
                else{
                balance -=balance1;
                account.balance +=balance1;
                System.out.println("Thank You for transferring money.");
                }
            }
            else
            {
                System.out.println("This account doesn't belong to you");
            }
        }
        else{
            System.out.println("The object must be of type AccountObject");
        }
    }

    @Override
    public String toString() {
        return "The account number is ("+AccountNumber+"). The name of the user is (" + name + "). The type of account is ("+type+"). The balance is ($"+balance+").";

    }

    @Override
    public boolean equals(Object object1) {
        if (object1 instanceof AccountObject) {
            AccountObject account = (AccountObject) object1;
            if (name.equals(account.name) && type.equals(account.type) && Math.abs(balance - account.balance) < 0.0001) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("The object must be of type AccountObject");
            return false;

        }
    }
}
