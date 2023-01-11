package week7_exercises;

import java.util.Scanner;

public class Car {

    private int id;
    private int productionYear;
    private int power;
    public static int counter;

    public Car(int id, int productionYear){
        this.id = id;
        this.productionYear = productionYear;
        counter++;
    }

    public void setPower(int power){
        this.power = power;
    }
    public int getProductionYear(){
        return productionYear;
    }

    public int getAge(){
        return (2022 - productionYear);
    }

    public void startAndMove(){
        System.out.println("Start!");
    }

    public void stop(){
        System.out.println("Stop!");
    }

    public String toString(){
        return ("Id: " + id + " Production Year: " + productionYear + " Power: " + power + " Age: " + getAge());
    }

}

class Garage{
    private Car[] cars;

    public Garage(Car[] cars){
        this.cars = cars;
    }

    public void printCarsOlderThan(int age){

        for(Car c: cars){
            if(c.getAge()>age)
                System.out.println(c);
        }

    }
}

class TestMain{
    public static void main(String[] args) {
        Car c1 = new Car(101, 2009);
        Car c2 = new Car(102, 2015);
        Car c3 = new Car(103, 2020);
        Car c4 = new Car(104, 2003);

        Car[] cars = {c1,c2,c3,c4};
        Garage garage = new Garage(cars);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int x = scanner.nextInt();

        garage.printCarsOlderThan(x);
        System.out.println(Car.counter);
    }
}
