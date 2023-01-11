package week8_exercises;

// overriding

public class Company {

    public void adress(){
        System.out.println("This is default adress!!");
    }
    
}

class Microsoft extends Company{
    @Override
    public void adress(){
        System.out.println("This is Microsoft's adress!");
    }
}

class Google extends Company{
    @Override
    public void adress(){
        System.out.println("This is Google's adress!");
    }
}

class Main{
    public static void main(String[] args) {

        Company c = new Company();
        Microsoft m = new Microsoft();
        Google g = new Google();

        c.adress();
        m.adress();
        g.adress();
    }
}
