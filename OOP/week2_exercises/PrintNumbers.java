import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class PrintNumbers {

    static void oneToNum(int Num){
        int i = 1;
        while(i<=Num){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        
    }
    static int sumNumbers(int Num){
        if(Num<=1)
            return Num;
        else 
            return Num + sumNumbers(Num-1);    
    }

    static void reverseNum(int Num){
        if(Num==0)
            return;
        System.out.print(Num + " ");    
        reverseNum(Num-1);    
    }
    
}
class Math{    
        public static void main(String[] args){

        PrintNumbers Math = new PrintNumbers();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int Num = scanner.nextInt();

        Math.oneToNum(Num);
        int result =  Math.sumNumbers(Num);
        System.out.println(result);
        Math.reverseNum(Num);        

    }
}
