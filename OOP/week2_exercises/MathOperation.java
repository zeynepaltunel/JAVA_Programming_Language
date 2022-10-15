import java.util.Scanner;

public class MathOperation{
    static int addition(int a, int b){
        return a+b;
    }
    static int substraction(int a, int b){
        return a-b;
    }
    static int division(int a, int b){
        return a/b;
    }
    static int multiplication(int a, int b){
        return a*b;
    }
}

class Main{
    public static void main(String[] args){

        int result;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number.");
        int x = scanner.nextInt();
        System.out.println("Enter second number.");
        int y = scanner.nextInt();

        MathOperation operation = new MathOperation();

        result = operation.addition(x, y);
        System.out.println(result);
        result = operation.substraction(x, y);
        System.out.println(result);
        result = operation.division(x, y);
        System.out.println(result);
        result = operation.multiplication(x, y);
        System.out.println(result);
    }
}