package week9_exercises;

public abstract class Employee {
    String name_surname;
    int ssn;
    
    public Employee(String n, int ssn){
        setName_surname(n);
        setSsn(ssn);
    }

    public void setName_surname(String name_surname){
        this.name_surname=name_surname;
    }

    public void setSsn(int ssn){
        this.ssn=ssn;
    }

    abstract double earning();

    @Override
    public String toString(){
        return "Name: " + this.name_surname + " Ssn: " + this.ssn;
    }
}

class HourlyEmployee extends Employee{
    double wage;
    int hours;

    public HourlyEmployee(String n, int ssn, double w, int h){
        super(n, ssn);
        this.hours=h;
        this.wage=w;
    }
    @Override
    double earning() {
        if(hours<=40)
            return wage*hours;
        else 
            return wage*hours + (hours-40)*wage*1.5;
    }

    @Override
    public String toString() {
        return super.toString() + " Wage: " + this.wage + " Hours: " + this.hours;
    }
}

class SalariedEmployee extends Employee{
    double weeklySalary;

    public SalariedEmployee(String n, int ssn, double ws){
        super(n, ssn);
        this.weeklySalary = ws;
    }

    @Override
    double earning(){
        return weeklySalary;
    }
}

class CommisionEmployee extends Employee{
    double grossSale;
    double commisionRate;

    public CommisionEmployee(String n, int ssn, double gSale, double cRate){
        super(n, ssn);
        this.grossSale = gSale;
        this.commisionRate = cRate;
    }

    @Override
    double earning() {
        return grossSale*commisionRate;
    }

    @Override
    public String toString() {
        return super.toString() + " Gross Sale: " + this.grossSale + " Commision Rate: " + this.commisionRate;
    }
}

class BasePlusCommisionEmployee extends CommisionEmployee{
    double baseSalary;

    public BasePlusCommisionEmployee(String n, int ssn,double gSale, double cRate,double bSalary){
        super(n, ssn, bSalary, bSalary);
        this.baseSalary=bSalary;
    }

    @Override
    double earning() {
        return super.earning() + this.baseSalary;
    }
}

class Mainclass{
    public static void main(String[] args) {
        Employee e1 = new HourlyEmployee("Zeynep", 1234, 30, 35);
        Employee e2 = new SalariedEmployee("Gulde", 5678, 2500);
        Employee e3 = new CommisionEmployee("Muge", 9012, 100000, 0.1);
        Employee e4 = new BasePlusCommisionEmployee("Ali", 4567, 100000, 0.2, 5000);

        Employee[] employees = new Employee[]{e1,e2,e3,e4};

        for( Employee e: employees){
            System.out.println(e + " Salary: " + e.earning());
        }
    }
}
