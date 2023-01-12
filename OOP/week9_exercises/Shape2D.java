package week9_exercises;

public abstract class Shape2D {
    public static final double PI = 3.14;
    public double height;
    public double width;
    public double radius;
    
    // constructor 1
    public Shape2D(double width, double height){
        this.width=width;
        this.height=height;
    }

    // constructor 2
    public Shape2D(double width,double height,  double radius){
        this(width, height);
        this.radius=radius;
    }


    public abstract double computeArea();

    @Override
    public String toString(){
        return "Area: " + computeArea();
    }
 
}

abstract class Shape3D extends Shape2D{
    public double depth;

    // constructor 1
    public Shape3D(double width, double height,double depth){
        super(width,height);
        this.depth=depth;
    }

    public  Shape3D(double height,double radius){
        super(0,height, radius);
    }

    public abstract double computeVolume();

    
    @Override
    public String toString(){
        return "Area: " + computeArea() + " " + "Volume: " + computeVolume();
    }
}

class Rectangle extends Shape2D{
    
    public Rectangle(double width, double height){
        super(width,height);
    }

    @Override
    public double computeArea(){
        return width*height;
    }


}  

class Square extends Shape2D{
    
    public Square(double width){
        super(width, 0);
    }

    @Override
    public double computeArea(){
        return width*width;
    }

}

class Cube extends Shape3D{

    public Cube(double width){
        super(width, 0, 0);
    }
    
    @Override
    public double computeArea(){
        return 6*width*width;
    }

    @Override
    public double computeVolume(){
        return width*width*width;
    }

}

class Cylinder extends Shape3D{

    public Cylinder(double height, double radius){
        super(height, radius);
    }

    @Override
    public double computeArea(){
        return (2*Shape2D.PI*radius*radius) + (2*PI*radius*height);
    }

    @Override
    public double computeVolume(){
        return PI*radius*radius*height;
    }
}

class Main{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(25,10);
        Rectangle r2 = new Rectangle(10, 20);
        Square s1 = new Square(20);
        Square s2 = new Square(20);
        Cube c1 = new Cube(5);
        Cube c2 = new Cube(10); 
        Cylinder cy1 = new Cylinder(10, 2);
        Cylinder cy2 = new Cylinder(15, 3);

        compareArea(r1, r2);
        compareArea(s1, s2);
        compareArea(c1, c2);
        compareArea(cy1, cy2);

        compareVolume(c1, c2);
        compareVolume(cy1, cy2);

    }

    public static void compareArea(Shape2D s1, Shape2D s2){
        if(s1.computeArea()>s2.computeArea()){
            System.out.println( "First area is bigger than second.");
            System.out.println("Bigger area: "+ s1.computeArea());
        }
        else if(s1.computeArea()==s2.computeArea()){
            System.out.println("Areas are equal");
            System.out.println("Area: "+ s1.computeArea());
        }
        else{
            System.out.println("Second area is bigger than first.");
            System.out.println("Bigger area: "+ s2.computeArea());
        }
    }

    public static void compareVolume(Shape3D s1, Shape3D s2){
        if(s1.computeVolume()>s2.computeVolume()){
            System.out.println("s1's volume is bigger than s2.");
            System.out.println("Bigger volume: "+ s1.computeVolume());
        }
        else if(s1.computeVolume()==s2.computeVolume()){
            System.out.println("s1's volume equal to s2.");
            System.out.println("Volume: "+ s1.computeVolume());;
        }
        else{
            System.out.println("s2's volume is bigger than s1.");
            System.out.println("Bigger volume: "+ s2.computeVolume());
        }
    }  
}
