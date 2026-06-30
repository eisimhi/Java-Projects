import java.util.Scanner;

public class WORK {
    public static void main(String[]args){
     double min =8.00;
        Scanner s =new Scanner(System.in);
        System.out.println("How much time have you worked?(the max is 60 hours)");
        int hours = s.nextInt();
        double salary= hours*min;
        if (hours>60){
            System.out.println("you cant work more than 60 hours,we will count it as 60");
            hours=60;
        }
        if (hours > 40) {
            int regularHours = 40;
            int overtimeHours = hours - 40;
            salary = (regularHours * min) + (overtimeHours * min * 1.5);
        } else {
            salary = hours * min;
        }

        System.out.println("Your salary is: " + salary);
    }
}