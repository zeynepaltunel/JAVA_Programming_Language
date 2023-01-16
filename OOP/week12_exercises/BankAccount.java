package week12_exercises;

import java.util.ArrayList;
import java.util.Collections;

public class BankAccount implements Comparable<BankAccount>{
    int accountNo;
    String holderName;
    double balance;

    public BankAccount(int accountNo, String holderName, double balance){
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }
    
    void balanceChange(double amount){
        this.balance-=amount;
    }

    @Override
    public int compareTo(BankAccount other){
        return this.holderName.compareTo(other.holderName);
    }

    @Override
    public String toString() {
        return "Account:"+accountNo+", "+holderName+", "+balance;
    }
    
}

class Main{
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1, "Zeynep", 500);
        BankAccount a2 = new BankAccount(2, "Muge", 600);
        BankAccount a3 = new BankAccount(3, "Gulde", 300);
        BankAccount a4 = new BankAccount(4, "Ali", 1000);

        ArrayList <BankAccount> myAccounts = new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);

        Collections.sort(myAccounts);


        for (BankAccount bankAccount : myAccounts) {
            bankAccount.balanceChange(500);
            System.out.println(bankAccount);
        }
    }
}
