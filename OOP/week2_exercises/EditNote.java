import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class EditNote {

    String name;
    String surname;
    int studentNumber;
    float midExam;
    float finalExam;
    
    static float average(float mid, float finaL){
        float result = mid*.4f + finaL*.6f;
        return result;
    }

    static float finalNote(float mid, float finaL){
        if(average(mid, finaL) < 60)
            finaL = finaL + 10;
        return finaL;
    }
    
}

class Edit{
    public static void main(String[] args){
        EditNote note = new EditNote();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        note.name = scanner.nextLine();
        System.out.println("Enter surname: ");
        note.surname = scanner.nextLine();
        System.out.println("Enter student number: ");
        note.studentNumber = scanner.nextInt();
        System.out.println("Enter midterm exam note: ");
        note.midExam = scanner.nextInt();
        System.out.println("Enter final exam note: ");
        note.finalExam = scanner.nextInt();

        float Final = note.finalExam;

        note.finalExam = note.finalNote(note.midExam, note.finalExam);

        if(note.finalExam==Final){
            System.out.println(note.name + " " + note.surname + " " + note.studentNumber);
            System.out.println("Note not change!");
        }
            
        else{
            System.out.println(note.name + " " + note.surname + " " + note.studentNumber);
            System.out.println("New average note is " + note.average(note.midExam, note.finalExam));
        }    

    }
}
