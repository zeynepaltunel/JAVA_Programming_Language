import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args){
        
        float mid,fin,result;

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter your midterm and final note:");
            mid = input.nextFloat();
            fin = input.nextFloat();  
            result = mid*0.4f + fin*0.6f;
            
            if(result>65){
                System.out.println("You passed!");
            }
            else
                System.out.println("You failed!");
        }
        finally{
            input.close();
        }

    }
    
}
