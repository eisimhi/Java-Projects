import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("put a four digit number");
        int num = in.nextInt();
        System.out.println("put a number between one and four");
        byte moves = in.nextByte();
        shiftRight(num,moves);
        shiftLeft(num,moves);


    }
    public static int shiftRight(int num, int moves){
        int a1 = num%10,a10=(num/10)%10,a100=(num/100)%10,a1000=num/1000;
        if (num>9999||num<1000||moves>4||moves<1){
            System.out.println("one of the inputs were wrong");
            System.out.println("-1");
        }else {
        if (moves==1){
            num=a1*1000+a10+a100*10+a1000*100;
            System.out.println(num);
        }else if (moves==2){
            num=a1*100+a10*1000+a100+a1000*10;
            System.out.println(num);
        }else if (moves==3){
            num=a1*10+a10*100+a100*1000+a1000;
            System.out.println(num);
        }else
            System.out.println(num);}
        return num;
    }
    public static int shiftLeft(int num,int moves){
        int a1 = num%10,a10=(num/10)%10,a100=(num/100)%10,a1000=num/1000;
        if (num>9999||num<1000||moves>4||moves<1){
            System.out.println("one of the inputs were wrong");
            System.out.println("-1");
        }else {
            if (moves==1){
                num=a1*10+a10*100+a100*1000+a1000;
                System.out.println(num);
            }else if (moves==2){
                num=a1*100+a10*1000+a100+a1000*10;
                System.out.println(num);
            }else if (moves==3){
                num=a1*1000+a10+a100*10+a1000*100;
                System.out.println(num);
            }else
                System.out.println(num);}
        return num;
    }
}
