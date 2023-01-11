package week8_exercises;

public class Animal{

    String color;
    
    public Animal(String color){
        this.color = color;
    }

    public void eat(){
        System.out.println("Animals eat!!");
    }
}

class Cat extends Animal{
    
    public int age;

    public Cat(int age, String color){
        super(color);
        this.age=age;
    }

    public void meow(){
        System.out.println("Meoow!!");
    }

    @Override
    public void eat(){
        System.out.println("Cats eat!!");
    }
}

class Dog extends Animal{

    public String breed;

    public Dog(String breed, String color){
        super(color);
        this.breed=breed;
    }

    public void bark(){
        System.out.println("Bark!!");
    }

    @Override
    public void eat(){
        System.out.println("Dogs eat!!");
    }
}

class Test{
    public static void main(String[] args) {

    Dog d = new Dog("Golden","White");
    System.out.println("Color: " + d.color + "  Breed: " + d.breed);
    d.eat();

    Cat c = new Cat(2, "Black");
    System.out.println("Age:" + c.age + "  Color: " + c.color);
    c.eat();
        
    }
}