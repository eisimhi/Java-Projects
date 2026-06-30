import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("give me a number(press -1 to stop)");
        int num1= in.nextInt();
        int evenNum=0;
        while (num1!=-1){
            if (num1%2==0){
                evenNum++;
            }
            num1= in.nextInt();
        }
        System.out.println("there are: "+evenNum+" even numbers");
    }
}