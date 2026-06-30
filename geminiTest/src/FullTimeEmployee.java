import java.util.Scanner;

public class FullTimeEmployee extends Employee {
    private double salary;

    @Override
    public double calculateSalary() {
        Scanner in = new Scanner(System.in);
        System.out.println("what is your salary? ");
        double salary = in.nextInt();
        this.salary=salary;
        return this.salary;
    }
}
