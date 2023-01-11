package LAB5;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String job;
    ArrayList<Car> garage;

    public Person(String firstName, String lastName, int age, String job){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
        garage = new ArrayList<>();
    }

    public void addCarToGarage(){
        if(garage.isEmpty()){
            System.out.println("Your garage is empty.");
            return;
        }
        System.out.println("There are " + garage.size() + " cars in " + this.firstName + "'s garage.");

        for ( int i = 0; i< garage.size(); i++){
            System.out.println("Car (" + (i+1) + ") Color: " + garage.get(i).getColor() + " Model: " + garage.get(i).getModel());;
        }
    }

    public void showInfo(){
        System.out.println("Full name: " + firstName + " " + lastName + " " + age + " " + job);
    }
}
