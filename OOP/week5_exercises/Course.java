public enum Course {

    PHYSICS(101,"NEWTON"),
    MATH(307,"ÖMER HAYYAM"),
    CHEMISTRY(207,"AZİZ SANCAR");
    
    private int courseId;
    private String lecturer;

    Course(int Id, String lecturer){
        this.courseId = Id;
        this.lecturer = lecturer;
    }

    public String getLecturer(){
        return lecturer;
    }

    public int getId(){
        return courseId;
    }
    
}

class test{
    public static void main(String[] args) {
        
        Course[] allCourses = Course.values();

        for(Course c : allCourses){
            System.out.println(c.getId()+ " " + c  +" given by "+ c.getLecturer());
        }
    }
}
