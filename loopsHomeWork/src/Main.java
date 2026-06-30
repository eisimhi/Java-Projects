import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int sum = 0;
        for (int i=17;i<33;i++){
            if (i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("the sum of those numbers is: "+sum);

        int sum2 = 0;
        int i=17;
        while (i<33){
            i++;
            if (i%2==0){
                System.out.println(i);
                sum2+=i;
            }
        }
        System.out.println("the sum of those numbers is: "+sum2);
        */
        System.out.println("give me a starting number");
        int start = in.nextInt();
        System.out.println("give me the ending number");
        int end = in.nextInt();
        for (int z =start+1;z<end;z++){
            System.out.println(z);
        }
        int z=start;
        while (z<end-1){
            System.out.println(z);
            z++;
                }
        int sum3=0;
        System.out.println("give me another number");
        int another = in.nextInt();
        for (int z2 =start+1;z2<end;z2++){
            if (z2%another==0){
                System.out.println(z2);
                sum3+=z2;
            }
        }
        System.out.println(sum3);


    }
}