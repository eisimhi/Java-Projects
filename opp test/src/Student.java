public class Student {
    private String name;
    private int grade;
    private int id;
    private static int totalStudents;
    private Car car;

    public Student(){
        totalStudents++;
        this.name="chatGPT";
        this.grade=98;
        this.id=totalStudents;
    }
    public Student(String name,int grade){
        totalStudents++;
        this.name=name;
        this.grade=grade;
        this.id=totalStudents;
    }
    public Student(Student s1){
        totalStudents++;
        this.name=s1.name;
        this.grade= s1.grade;
        this.id=totalStudents;
    }

    public void setGrade(int grade) {
        if (grade>=0&&grade<=100)
            this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student #"+id+"\n"+
                "grade: "+grade+"\n"+
                "name: "+name;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
