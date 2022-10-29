import java.util.Scanner;

public class Account{

    private double balance;
    private String ownerName;
    private String password;

    public Account(String ownerName, double balance,String password){
        this.ownerName = ownerName;
        this.balance=balance;
        this.password=password;
    }
    public void add(double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount){
        Scanner scanner = new Scanner(System.in);
        Boolean isMatch =false;

        for(int i=0; i<3; i++){
            System.out.println("Please enter the 4-digit pass: ");
            String passWord = scanner.nextLine();
            if(passWord.equals(password)){
                isMatch=true;
                balance=balance-amount;
                break;
            }
        }
        if(!isMatch){
            System.out.println("Your account has been blocked, please try again later!");
        }
    }
    public double getBalance(){
        return balance;
    }

    public void setOwnerName(String ownerName){
        this.ownerName=ownerName; 
    }
    public String getName(){
        return ownerName;
    }

    public static void main(String[] args) {

        Account account1 = new Account("Ayşe", 125.50, "1234");

        System.out.println("Account Ownername: " + account1.getName());
        account1.setOwnerName("Zeynep");
        System.out.println("New Account Ownername: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());
        
        System.out.println("How much money do you want to add?");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        account1.add(money);
        System.out.println("Balance after adding: " + account1.getBalance());

        System.out.println("How much money do you want to withdraw?");
        money = scanner.nextDouble();
        account1.withdraw(money);
        System.out.println("Balance after withdrawing: " + account1.getBalance());
    }
}