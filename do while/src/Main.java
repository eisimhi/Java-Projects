import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*       Scanner scanner =new Scanner(System.in);
        int num,count=0;
        do {
         //עושים את לולאת DO WHILE רק כשרוצים לאבטח קלט, לדוגמא פה אני רוצה "לאבטח" שהמספר שהמתשמש מביא לי הוא לא קטן מ1 וגדול מ5
            System.out.println("enter a number between 1-5");
            num=scanner.nextInt();
            count++;
            if (count==5){
                System.out.println("you have been blocked from the system");
                System.exit(67);
            }
        }while (num>5||num<1);

        //כשכותבים לולאת DO WHILE צריך לכתוב בתוך הWHILE את התנאי שהוא נחשב לא נכון, לדוגמא פה אני אומר ללולאה להמשיך לרוץ כל עוד המספר שהמשתמש נתן לי הוא גדול מ5 וקטן מ1
        System.out.println(num+" is good enough");
        System.out.println("you tried "+count+" times");
*/
    }
}
class testDoWhile{
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        int choice,count=0;
        do {
            System.out.println("pick a number between 10-20");
             choice = s.nextInt();
        }while (choice<10||choice>20);
         System.out.println("number accepted: "+choice);

         int pos;
         do {
             System.out.println("please enter a positive number");
             pos=s.nextInt();
         }while (pos<0||pos==0);
         System.out.println("thank you your number is: "+pos);

         int secret,counter=0;
        Random r = new Random();
        int random = r.nextInt(10)+1;
         do {
             System.out.println("guess the secret number between 1-10");
             secret=s.nextInt();
             counter++;
             if (counter==3){
                 System.out.println("you are blocked from the system");
                 System.exit(67);

             }
         }while (random!=secret);



         System.out.println("Correct!");

         int sum=0,playerChoise;
         do {
             System.out.println("please enter numbers until the sum will be 50");
             playerChoise=s.nextInt();
             sum+=playerChoise;
             System.out.println("the current sum is: "+sum);
         }while (sum<50);
         System.out.println("total sum reached:" +sum);
    }
}
