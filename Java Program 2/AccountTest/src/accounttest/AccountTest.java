package accounttest;

import java.util.Scanner;

class Account{
    private double balance;
    
    public Account(double initialbalance){
        if(initialbalance>0){
            balance = initialbalance;
        }
    }
    public void credit(double amount){
        balance = balance+amount;
    }
    public double myBalance(){
        return balance;
    }
}


public class AccountTest {

    public static void main(String[] args) {
        
        Account obj1 = new Account(50.00);
        Account obj2 = new Account(-7.53);
        
        System.out.println("Account1 Balance : "+obj1.myBalance());
        System.out.println("Account2 Balance : "+obj2.myBalance()+"\n");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the deposit amount of account1 :");
        double depositAmount = input.nextDouble();
        System.out.println("Adding :"+depositAmount+" in the account1.");
        obj1.credit(depositAmount);
        System.out.println("Account1 Balance : "+obj1.myBalance());
        System.out.println("Account2 Balance : "+obj2.myBalance()+"\n");
        
        System.out.println("Enter the deposit amount of account2 :");
        double depositAmount2 = input.nextDouble();
        System.out.println("Sdding :"+depositAmount2+" in the account2.");
        obj2.credit(depositAmount2);
        System.out.println("Account Balance1:"+obj1.myBalance());
        System.out.println("Account Balance2:"+obj2.myBalance());
        
        
    }
    
}
