import java.util.Scanner;

public class MyMethod {

    static void addTwoNumbers(int a,int b){
        int sum=a+b;
        System.out.println("Result = "+sum);
    }

    static void nameSurname(){
        String x;
        String y;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        x=scanner.nextLine();
        System.out.println("Enter your surname: ");
        y=scanner.nextLine();

        System.out.println(x + " " + y);

    }
    public static void main(String[] args){

        int a = 20;
        int b = 30;
        
        addTwoNumbers(a, b);
        nameSurname();
    }
}
