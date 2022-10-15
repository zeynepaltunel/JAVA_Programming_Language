import java.util.Scanner;

class Worker{
    String name;
    int socialSecurityNumber;
    float Wage;            
    int workingHours;

    public void displayInfo(){
        System.out.println(name + " " + socialSecurityNumber);
    }
    public void displaySalary(){
        double salary = Wage * workingHours;
        System.out.println (salary);
    }
    
    public static void main(String[] args){
        Worker worker = new Worker();

        worker.name = "Ahmet";
        worker.socialSecurityNumber = 235689;
        worker.Wage = 135.4f;
        worker.workingHours = 8;

        worker.displayInfo();
        worker.displaySalary();

        Scanner scanner = new Scanner(System.in);

        Worker worker2 = new Worker();
        System.out.println("Worker Name: ");
        worker2.name = scanner.nextLine();

        System.out.println("Social Securty Number: ");
        worker2.socialSecurityNumber = scanner.nextInt();
        
        System.out.println("Wage: ");
        worker2.Wage = scanner.nextFloat();

        System.out.println("Working Hours: "); 
        worker2.workingHours = scanner.nextInt();

        worker2.displayInfo();
        worker2.displaySalary();
    }
}

