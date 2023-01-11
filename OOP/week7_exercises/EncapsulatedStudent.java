package week7_exercises;

class EncapsulatedStudent {

    private int midterm;
    private int finalExam;

    public EncapsulatedStudent(int midterm, int finalExam){
        setMidterm(midterm);
        setFinalExam(finalExam);
    }

    public void setMidterm(int midterm) {
        if(midterm<0 || midterm>100)
            throw new IllegalArgumentException("Error midterm!");
        this.midterm = midterm;
    }

    public void setFinalExam(int finalExam) {
        if(finalExam<0 || finalExam>100)
            throw new IllegalArgumentException("Error finalExam!");
        this.finalExam = finalExam;
    }

    public float getAverage(){
        return (midterm*.4f + finalExam*.6f);
    }
}

class Main{
    public static void main(String[] args) {
        try {
            EncapsulatedStudent student1 = new EncapsulatedStudent(-90, 15); 
        
            System.out.println(student1.getAverage());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
