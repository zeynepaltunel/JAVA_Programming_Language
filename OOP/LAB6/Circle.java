package LAB6;

public class Circle {
    private static double PI=3.14;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double computeArea(){
        return (PI * radius * radius);
    }
}

class Test{
    public static void main(String[] args) {
        
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);
        Circle c3 = new Circle(25);

        Circle[] circles = {c1,c2,c3};

        for(Circle myCircle: circles){
            System.out.println(myCircle.computeArea());
        }
    }
}
