import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int num = in.nextInt();
        zogi(num);

        System.out.println("what is your age");
        int age = in.nextInt();
        System.out.println("what is your net worth");
        int net = in.nextInt();
        if (age>=18&&net>100000)
            System.out.println("you are allowed in");
        else
            System.out.println("you are not allowed in");

        System.out.println("write a word");
        String word1 = in.next();
        System.out.println("write another word");
        String word2 = in.next();
        int len1= word1.length();
        int len2= word2.length();
        if (len1>len2)
            System.out.println("the first word is longer than the second");
        else if (len2>len1)
            System.out.println("the second word is longer than the first");
        else
            System.out.println("both of the words are equal in length");

        System.out.println("write one letter");
        char letter = in.next().charAt(0);
        if (letter=='A')
            System.out.println("big letter");
        else
            System.out.println("another letter");


        Random rng = new Random();
        int random = rng.nextInt(50)+1;
        if (random>25)
            System.out.println("BIG");
        else
            System.out.println("smaller of equal");

        System.out.println("give me a number");
        int abs = in.nextInt();
        NoAbs(abs);

        System.out.println("give me 3 numbers");
        double n1 = in.nextInt();
        double n2 = in.nextInt();
        double n3 = in.nextInt();
        System.out.println(avg(n1,n2,n3));

        System.out.println("give me a number between 1-7(days of the week)");
        byte day = in.nextByte();
        dayOfTheWeek(day);

        System.out.println("give me your grade");
        double grade = in.nextDouble();
       grade = grade+(grade*0.10);
        System.out.println(grade);
        double newerGrade = (int)grade;
        System.out.println(newerGrade);

        System.out.println("give me two decimal numbers");
        double d1 = in.nextDouble();
        double d2 = in.nextDouble();
        double d3 = Math.max(d1,d2);
        double d4 = Math.min(d1,d2);
        System.out.println("the bigger number is: "+d3);
        System.out.println("the smaller number is: "+ d4);*/

            System.out.println("put a number");
            int x = in.nextInt();
            numbers(x);

            System.out.println("PUT YOUR AGE");
            byte ages = in.nextByte();
            age(ages);

            System.out.println("PUT 2 NUMBERS");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            zogis(num1,num2);

            System.out.println("put one word");
            String Word = in.next();
            string(Word);

            System.out.println("put one letter");
            char ch = in.next().charAt(0);
            cha(ch);

            System.out.println("put a number");
            int i = in.nextInt();
            if (tf(i))
                System.out.println("תקין");
            else
                System.out.println("לא תקין");

            dis();

            System.out.println("put another number");
            int xx = in.nextInt();
            h(xx);


    }


    public static boolean zogi(int x) {
        if (x % 2 != 0) {
            System.out.println("odd");
            return true;
        } else {
            System.out.println("even");
            return false;
        }
    }
    public static void NoAbs(int abs){

        int abs2 = abs+(-2*abs);
        if (abs>=0)
            System.out.println(abs);
        else
            System.out.println(abs2);

    }
    public static double avg(double x, double y, double z){
        double c =(x+y+z)/3;
        return c;
    }
    public static void dayOfTheWeek(byte x){
        switch (x){
            case 1:System.out.println("sunday");break;
            case 2:System.out.println("monday");break;
            case 3:System.out.println("tuesday");break;
            case 4:System.out.println("wednesday");break;
            case 5:System.out.println("thursday");break;
            case 6:System.out.println("friday");break;
            case 7:System.out.println("saturday");break;
        }
    }
    public static boolean numbers(int x){
        if (x>10&&x<50)
            return true;
        else
            return false;
    }
    public static boolean age (byte x){
        return x>=18&&x<=65;
    }
    public static boolean zogis (int x, int y){
        return x%2==0&&y%2==0;
    }
    public static boolean string (String x){
        int y = x.length();
        return y==5;
    }
    public static boolean cha(char x){
        return x=='a'||x=='A';
    }
    public static boolean tf (int x){
        if (x>0)
            return true;
        else
            return false;
    }
    public static boolean dis(){
        Scanner in = new Scanner(System.in);
        System.out.println("האם אתה תלמיד או אזרח ותיק");
        String discount = in.nextLine();
        return discount.equals("אזרח ותיק")|| discount.equals("תלמיד");
    }
    public static boolean h (int x){
        return x<1&&x>100;
    }
}