import java.util.Scanner;

class Methods {

    int number;

    public void addNumbers(){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int result = a + b;
        System.out.println(result);
    
    }
    public void evenOrOdd(){

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if(number%2==0){
            System.out.println("Entered number is even.");
        }
        else{
            System.out.println("Entered number is odd.");
        }
    }
}

class Main{
    public static void main(String[] args){

        Methods method = new Methods();
 
        method.addNumbers();
        method.evenOrOdd();

    }
}
   

