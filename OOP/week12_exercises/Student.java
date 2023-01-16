package week12_exercises;

public abstract class Student {
    int id;
    float mid;
    float fin;

    public Student(int id, float mid, float fin){
        this.id=id;
        this.mid=mid;
        this.fin=fin;
    }

    abstract float computeTotalScore();
    float computeBaseScore(){
         return mid*0.4f + fin*0.6f;
    }
}

interface ArticleScoreBehaviour {
    float articleScore();
}

interface ConferenceScoreBehaviour {
    float conferenceScore();
}

interface ProjectScoreBehaviour {
    float projectScore();    
}

class MasterStudent extends Student implements ConferenceScoreBehaviour{
    int numberOfConf;

    public MasterStudent(int id, float mid, float fin, int numberOfConf){
        super(id, mid, fin);
        this.numberOfConf=numberOfConf;
    }

    @Override
    public float computeTotalScore(){
        return  computeBaseScore() + conferenceScore();    
    }

    @Override
    public float conferenceScore(){
        return numberOfConf*5;
    }
}

class BachelourStudent extends Student implements ProjectScoreBehaviour{
    public BachelourStudent(int id, float mid, float fin){
        super(id, mid, fin);
    }

    @Override
    public float computeTotalScore(){
        return  computeBaseScore() + projectScore();
    }

    @Override
    public float projectScore(){
        return 20;
    }
}

class PhDStudent extends MasterStudent implements ArticleScoreBehaviour{
    int numberOfArticles;

    public PhDStudent(int id, float mid, float fin,int numberOfConf,int numberOfArticles){
        super(id, mid, fin, numberOfConf);
        this.numberOfArticles=numberOfArticles;
    }

    @Override
    public float computeTotalScore(){
        return  computeTotalScore() + articleScore();
    }

    @Override
    public float articleScore(){
        return numberOfArticles*8;
    }
}

class StudentApp{
    public static void main(String[] args) {
        Student student1 = new BachelourStudent(10, 50, 90);
        Student student2 = new MasterStudent(10, 50, 90,5);
        Student student3 = new PhDStudent(10, 50, 90,2,1);
    }
}