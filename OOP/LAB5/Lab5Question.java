package LAB5;

public class Lab5Question {
    public static void main(String[] args) {
        Person person1 = new Person("Ali", "Kaya", 25, "Computer Engineer");
        Car car1 = new Car(person1, "Black", "Audi A5");
        car1.getOwner().showInfo();

        Person person2 = new Person("Ahmet", "Kılıç", 35, "Lawyer");
        car1.changeOwner(person2);
        car1.getOwner().showInfo();

        person1.addCarToGarage();
        person2.addCarToGarage();
        
    }
}
