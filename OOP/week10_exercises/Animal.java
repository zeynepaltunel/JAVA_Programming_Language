package week10_exercises;

public abstract class Animal {
    public String name;

    public Animal(String name){
        this.name=name;
    }
    
    abstract String getName();

    abstract void print();
}

interface Moveable {
    public void move();
}

interface Flyable {
    public void fly();
}

interface Swimmable {
    public void swim();
}

class Duck extends Animal implements Moveable,Flyable,Swimmable{

    public Duck(String name){
        super(name);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void print(){
        System.out.print("Duck: ");
    }
    @Override
    public void move(){
        System.out.println("Duck can swim.");
    }
    @Override
    public void fly(){
        System.out.println("Duck can move.");
    }
    @Override
    public void swim(){
        System.out.println("Duck can swim.");
    }
}

class Cat extends Animal implements Moveable{
    
    public Cat(String name){
        super(name);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void print(){
        System.out.print("Cat: ");
    }
    @Override
    public void move(){
        System.out.println("Cat can swim.");
    }
}

class Bird extends Animal implements Flyable{
    
    public Bird(String name){
        super(name);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void print(){
        System.out.print("Bird: ");
    }
    @Override
    public void fly(){
        System.out.println("Bird can move.");
    }
}

class TestMain{
    public static void main(String[] args) {
        Duck duck = new Duck("Daffy");
        Cat cat = new Cat("Sylvester");
        Bird bird = new Bird("Tweety");

        Animal[] animals = {duck,cat,bird};

        for (Animal animal : animals) {
            if(animal instanceof Flyable || animal instanceof Swimmable || animal instanceof Moveable){
                animal.print();
                System.out.println(animal.getName()); 
            }     
        }
    }
}
