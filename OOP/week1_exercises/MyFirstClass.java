public class MyFirstClass{
    
    String brand = "BMW";
    String color = "Black";
    int year = 2001;

    public static void main(String[] args){
        
        MyFirstClass cars = new MyFirstClass();

        System.out.print(cars.brand + " " + cars.color + " " + cars.year);

    }
}