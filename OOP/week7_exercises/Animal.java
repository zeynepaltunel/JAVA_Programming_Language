package week7_exercises;

enum AnimalTypes{
    MAMMAL,
    BIRD,
    REPTILE,
    FISH
}

public class Animal {

    private String name;
    private AnimalTypes type;
    
    public Animal(String name, AnimalTypes type){
        this.name = name;
        this.type = type;
    }
    public String toString(){
        return "Name: " + name + " " + "Type: " + type;
    }
}

class Zoo{
    Animal[] animals;

    public Zoo(Animal[] animals){
        this.animals = animals;
    }

    public void printAnimals(){
        for(Animal a: animals){
            System.out.println(a);
        }
    }
}

class MainClass{
    public static void main(String[] args) {
        
        Animal a1 = new Animal("whale", AnimalTypes.MAMMAL);
        Animal a2 = new Animal("parrot", AnimalTypes.BIRD);
        Animal a3 = new Animal("snake", AnimalTypes.REPTILE);
        Animal a4 = new Animal("salmon",AnimalTypes.FISH);
        Animal[] animals = {a1,a2,a3,a4};

        Zoo myZoo = new Zoo(animals);

        myZoo.printAnimals();
    }
}
