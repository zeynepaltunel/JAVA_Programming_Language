import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class StudentInfo{
    String name;
    String surname;
    int StudentNum;
    int midExam;
    int finalExam;

    static void Info(String name, String surname, int number){
        System.out.println(name + " " + surname + " " + number);
    }

    static float average(int mid, int finaL){
        float result = mid*.4f + finaL*.6f;
        return result;
    }
}

class Info{
    public static void main(String[] args){

        float result;

        StudentInfo info = new StudentInfo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        info.name=scanner.nextLine();
        System.out.println("Enter your surname: ");
        info.surname=scanner.nextLine();
        System.out.println("Enter your student number: ");
        info.StudentNum=scanner.nextInt();
        System.out.println("Enter your midterm exam note: ");
        info.midExam=scanner.nextInt();
        System.out.println("Enter your final exam note: ");
        info.finalExam=scanner.nextInt();

        info.Info(info.name, info.surname, info.StudentNum);
        result = info.average(info.midExam,info.finalExam);
        System.out.println("Your total grade is " + result);

    }
}