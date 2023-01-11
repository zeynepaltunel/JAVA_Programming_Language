package LAB5;

public class Car {
    private Person owner;
    private String color;
    private String model;

    public Car(Person owner, String color, String model){
            this.owner = owner;
            this.color = color;
            this.model = model;
    }

    public void changeOwner(Person newOwner){
        this.owner = newOwner;
    }
    public Person getOwner(){
        return this.owner;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

}

