import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
        //  הפעולה VOID היא סוג מיוחד של פונקציה בJAVA שאומרת: הפונקציה הזאתי לא מחזירה כלום. אי אפשר לשמור ערך או להשתמש בו, הפונקציה יכולה לעשות פעולה אבל היא לא תחזיר ערך זה כמו חלל ריק שאתה יכול לשים בו דברים(פעולות)
        Scanner scanner = new Scanner(System.in);
        Random random =new Random();
       //for(int i=0;i< nums.length;i++)//nums.length=0-99 מאה ספרות
        int[] numbers = new int[100];
        int count =0;
        boolean found= false;
        for(int i =0;i<numbers.length;i++){
        numbers[i]=random.nextInt(100)+1;
       // האות I =0 ו I זה המיקום במערך NUMBERS וכל פעם הלולאה מתקדמת מקום במערך ושומרת בו מספר רנדומלי: במיקום הראשון של המערך[0] זה ישמור 99 ובמיקום השני[1] זה ישמור מספר רנדומלי אחר וזה ימשיך ככה עד שזה ישמור מספר בכל מקום במערך (מאה פעמים)
    // כתוב בתוך הסוגריים 100 שזה אומר שהלולאה תייצר מספרים רנדומליים מ0-99 ואז הפלוס אחד גורם לזה שבמקום 0-99 זה יהיה 1-100
            System.out.println(Arrays.toString(numbers));
        }
        for (int i=0;i<numbers.length;i++){
            count++;
            if (numbers[i]==1)found =true;

        }
        print("Number of steps= "+ count);
        count =0;
        found = false;
        count=findOne(numbers);
        print("Number of steps= "+ count);


       /* int n1, n2, sum;
        System.out.println("Enter 2 numbers:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        sum = sumNumbers(n1, n2);
        System.out.println(sum);

        if (isZugi(n1)) {
            print("Yay we got a zugi number");
        } else {
            print("Oh this number is not zugi");
        }
        print(sumNumbers(5, 7));
        print(sumNumbers(3, 7, 8));*/


    }
    public static int sumNumbers(int number1,int number2){//
     // אני מייצר פעולה שהיא מחזירה ערך של INT וקורא לה SUM NUMBERS ואז אני אומר שהפעולה הזאתי תיקח 2 מספרים ותחבר אותם ואז למעלה אני שם את N1 וN2 בתוך הפעולה כי אני רוצה להשתמש בפעולה הזאת עליהם
    return number1+number2;// אני נותן לפעולה הגדרה של מה היא תעשה
    }
    public static boolean isZugi(int number){
     // בפעולה הזאתי כל מספר שאני מכניס זה יבדוק האם זה זוגי או אי זוגי ואז למעלה אני שם את  N1 בתוך הפעולה ושם לו מספר ואז כל מספר שאני מכניס לN1 ישתמש בפעולה IS ZUGI ולפי זה התוכנה תחליט האם זה זוגי או אי זוגי
        return number%2==0;// return מחזיר פעולה

    }
    public static void print(String s){
   // יש לי פונקציה בשם PRINT ומה שזה עושה זה בעצם פונקציה שמקבלת רק מחרוזות וS זה משתנה מסוג STRING שמקבל את הפעולה ובעצם מה שS מכיל זה את המחרוזת שנשלחה לפונקציה: אם אני כותב שלום אז שלום נשמר בS ואז PRINT מדפיס את S
        System.out.println(s);
    }
    public static int sumNumbers(int number1, int number2,int number3){
        return number1+number2+number3;
    }
    public static void print(int n){
    // אותו דבר כמו ממקודם אבל הפעם הפונקציה PRINT שומרת מספר במקום מחרוזת(נגיד אני כותב PRINT 42 אז עכשיו N=42 ואז זה מדפיס לי את N בעזרת SYSO אבל אני צריך רק לכתוב PRINT
        System.out.println(n);
    }
    public static int findOne(int[]numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count++;
            if (numbers[i] == 1) return count;
            // פונקציה שמתחילה מ0 וממשיכה עד שכל המערך מלא והלולאה ממשיכה עד שכל 100 מקומות במערך מלאות וסופרת כמה זמן לקח למצוא את המספר 1 אם זה מוצא את המספר לפני שהלולאה נגמרה זה שומר את המספר בCOUNT ואז כותב את זה בשורה 28 ואם זה לא מוצא את המספר 1 זה כותב בשורה 28 את המספר 1- במקום
        }
        return -1;
    }
}