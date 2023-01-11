package week8_exercises;

public class Parent {
    private int attribute1 = 1;
    protected int attribute2 = 1;
    public int attribute3 = 1;
    protected final static int attribute4 = 1;

    private void method1(){
        System.out.println("a");
    }
    public void method2(){
        System.out.println("b");
    }
    protected void setAttribute(int value){
        this.attribute1 = value;
    }
}

class Child extends Parent{
    public int attribute5;

    public Child(){
        attribute5=0;
        attribute2++;
        attribute3++;
        attribute5++;

        method2();

        setAttribute(attribute5);
    }
}

class Mainn{
    public static void main(String[] args) {
        
        Child c = new Child();
      
        System.out.println(c.attribute2);
        System.out.println(c.attribute3);
        System.out.println(Parent.attribute4);
        System.out.println(c.attribute5);
    }
}
