import java.util.Scanner;

/*public class Main {
    public static void main(String[] arguments) {
  /*      Scanner s = new Scanner(System.in);
        /*System.out.println("מה הציון של התלמיד בתעודה");
        int grade = s.nextInt();
        if (grade < 40 || grade > 100) {
            System.out.println("ציון שגוי");
            System.exit(111111111);

        }
        if (grade >= 40 && grade <= 60)
            System.out.println("אל תתייאש תשקיע יותר ותצליח(אולי)");
        else if (grade >= 61 && grade <= 80)
            System.out.println("תן עוד מאמץ ותתקדם יותר");
        else if (grade >= 81 && grade <= 95)
            System.out.println("ראוי להערכה");
        else
            System.out.println("מצטיין");


        int category;
        if (grade >= 40 && grade <= 60) category = 1;
        else if (grade >= 61 && grade <= 80) category = 2;
        else if (grade >= 81 && grade <= 95) category = 3;
        else category = 4;

        switch (category) {
            case 1:
                System.out.println("הציון שלך הוא " + grade + " אל תתייאש תשקיע יותר ותצליח(אולי) ");
                break;
            case 2:
                System.out.println("הציון שלך הוא: " + grade + " תן עוד מאמץ ותתקדם יותר ");
                break;
            case 3:
                System.out.println("הציון שלך הוא: " + grade + " ראוי להערכה ");
                break;
            case 4:
                System.out.println("הציון שלך הוא " + grade + " מצטיין");
                break;
            default:
                System.out.println("מה עשית שגרם לתוכנית להיכשל");
                break;
        }*/


/*        System.out.println("תבחר משקה: 1=מים,2=תה,3=קפה,4=שוקו,5=מיץ");
        System.out.println("מחירון: מים=5,תה=6,קפה=8,שוקו=8.5,מיץ=7.5");
        byte drink = s.nextByte();
        if (drink < 1 || drink > 5) {
            System.out.println("פעולה לא חוקית");
            System.exit(0);
        }

        System.out.println("תביא סכום כסף למשקה");
        int money = s.nextInt();
        if (money < 0 || money > 100) {
            System.out.println("סכום לא תקין");
            System.exit(0);

        }
        System.out.println("כמה כוסות משקה אתה רוצה?(עד 10)");
        byte cups = s.nextByte();
        if (cups>10) {
            System.out.println("אמרתי עד 10");
            System.exit(1);
        }else
            System.out.println("ועכשיו לתשלום");

        int payment;
        if (drink==1)payment=1;
        else if (drink==2)payment=2;
        else if (drink==3)payment=3;
        else if (drink==4)payment=4;
        else payment=5;

        switch (payment){
            case 1: System.out.println("מחיר המשקה שלך הוא: "+drink*5);break;
            case 2: System.out.println("מחיר המשקה שלך הוא: "+drink*6);break;
            case 3: System.out.println("מחיר המשקה שלך הוא: "+drink*8);break;
            case 4: System.out.println("מחיר המשקה שלך הוא: "+drink*8.5);break;
            case 5: System.out.println("מחיר המשקה שלך הוא: "+drink*7.5);break;
        }

        double price = 0;
        switch (payment){
            case 1: price = drink * 5; break;
            case 2: price = drink * 6; break;
            case 3: price = drink * 8; break;
            case 4: price = drink * 8.5; break;
            case 5: price = drink * 7.5; break;
        }
        if (money<price){
            System.out.println("אין לך מספיק כסף");
            System.exit(0);
        }else if (money>price){
            System.out.println("יש לך יותר ממה שצריך הנה עודף: "+(money-price));
        }else{
            System.out.println("יש לך בדיוק!");
        }
    }
}*/

 class Switch {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int number;
         System.out.println("please enter a number");
         number = in.nextInt();
         switch (number) {
             case 1,2,3:
                 System.out.println("this number is small");
                 break;
             case 4,5,6:
                 System.out.println("this number is medium");break;
             case 7,8,9,10:
                 System.out.println("this number is big");break;
             default:
                 System.out.println("this is bigger than 10 or smaller than 1");break;
         }


     }
 }