import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int r = random.nextInt(20) + 1;
        int times = 0;

        System.out.println("PICK A NUMBER BETWEEN 1-20");

        while (true) {
            int player = scanner.nextInt();
            times++;

            if (player < 1 || player > 20) {
                System.out.println("I told you to pick a number between 1-20!");
                continue;
            }

            if (player == r) {
                System.out.println("You chose the right number, great job!");
                break;
            } else if (player > r) {
                System.out.println("Your number is bigger than the number the computer picked.");
            } else {
                System.out.println("Your number is smaller than the number the computer picked.");
            }

            System.out.println("Try again:");
        }
    }
}