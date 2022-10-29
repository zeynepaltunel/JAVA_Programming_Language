package LAB4;

import java.util.Scanner;

public class Workers {

    private String name;
    private int salary;
    static int counter = 0;

    public Workers(String name, int salary){
        this.name = name;
        this.salary = salary;
        counter++;
    }

    public void setName(String name){ this.name = name;}

    public void setSalary(int newSalary) throws Exception{
        if(newSalary<=0)
            throw new Exception("Salary amount must be greater than zero");
        this.salary = newSalary;        
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Workers w1 = new Workers("Zeynep",18000);
        Workers w2 = new Workers("Ali", 15000);
        System.out.println("There are "+ Workers.counter + " objects.");
        Workers w3 = new Workers("Mehmet", 17000);
        System.out.println("There are "+ Workers.counter + " objects.");

        try {
            System.out.println("Enter new salary of "+ w1.name + " :");
            w1.setSalary(scanner.nextInt());
            System.out.println("Name: "+ w1.name + " Salary: " + w1.salary);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        } 
    }  
}

