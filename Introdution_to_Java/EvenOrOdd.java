import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter an integer number: ");
            int num = input.nextInt();
            
            if(num%2 == 0){
                System.out.println("Entered number is even.");
            }
            else
                System.out.println("Entered number is odd.");
        }
        finally{
            input.close();    //This ensures that your Scanner is always closed, guaranteeing proper resource cleanup.
        }
        
    }
    
}
