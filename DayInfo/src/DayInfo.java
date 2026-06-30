import java.util.Scanner;

public class DayInfo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter day of year(1-360)");
        int dayInYear=input.nextInt();
        if (dayInYear<0||dayInYear>360){
            System.out.println("Error-day should be 1-360");
            System.exit(67);
        }
        int dayInWeek =dayInYear%7;
        switch (dayInWeek){
            case 1:
                System.out.println("Sunday");break;
            case 2:
                System.out.println("Monday");break;
            case 3:
                System.out.println("Tuesday");break;
            case 4:
                System.out.println("Wednesday");break;
            case 5:
                System.out.println("Thursday");break;
            case 6:
                System.out.println("Friday");break;
            case 0:
                System.out.println("Saturday");break;
        }
        int week =dayInYear/7;
        week++;
        System.out.println("Week "+week);
        int season =dayInYear/30;
        switch (season){
            case 1: case 2: case 12:
                System.out.println("Winter");break;
            case 3: case 4: case 5:
                System.out.println("Spring");break;
            case 6: case 7: case 8:
                System.out.println("Summer");break;
            case 9: case 10: case 11:
                System.out.println("Autumn");break;
        }

    }
}