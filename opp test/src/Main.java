public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("evyatar",99);
        Car c1=new Car();
        Car c2=new Car("ferray",10000000);
        s1.setCar(c1);
        s2.setCar(c2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        s1.setGrade(-50);
        s1.setGrade(100);
        c1.setPrice(5);
        c2.setPrice(999999999);
        Student s3=new Student(s2);
        Car c3=new Car(c2);


    }
}