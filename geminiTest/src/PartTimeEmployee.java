import java.util.Scanner;

public class PartTimeEmployee extends Employee {
    private double hourSalary;
    private double hours;

    @Override
    public double calculateSalary() {
        Scanner in = new Scanner(System.in);
        System.out.println("what is your salary per hour?");
        double salary= in.nextDouble();
        System.out.println("how many hours did you work?");
        double hours = in.nextDouble();
        return hours*salary;
    }
}
