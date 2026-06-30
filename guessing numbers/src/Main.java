import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("תבחר שני מספרים בין אחד ל10,000");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("תבחר פעולת חשבון(חיבור,חיסור,כפל,חילוק)");
        String playerChoice = scanner.next();
        if (playerChoice.equals("חיבור")) {
            System.out.println(firstNumber + secondNumber);
        } else if (playerChoice.equals("חיסור")) {
            System.out.println(firstNumber - secondNumber);
        } else if (playerChoice.equals("כפל")) {
            System.out.println(firstNumber * secondNumber);
        } else if (playerChoice.equals("חילוק")) {
            if (secondNumber != 0) {
                System.out.println(firstNumber / secondNumber);
            } else {
                System.out.println("שגיאה: לא ניתן לחלק ב-0");
            }
        } else {
            System.out.println("פעולה לא חוקית");
        }
        */

        /*System.out.println("מה הגיל שלך?");
        byte age = scanner.nextByte();
        scanner.nextLine();
        System.out.println("מה תעודת הזהות שלך?");
        String id = scanner.nextLine();
        if (age>=18){
            System.out.println("מלאי 18 ומעלה");
        }else {
            System.out.println("קטין");
        }
        if (id.length()==9){
            System.out.println("תעודת זהות תקינה");
        }else {
            System.out.println("תעודת זהות לא תקינה");
        }
        */

        /*System.out.println("תתן לי שלושה ציונים שקיבלת במבחנים");
        double firstGrade = scanner.nextInt();
        double secondGrade = scanner.nextInt();
        double thirdGrade = scanner.nextInt();
        double average = (firstGrade+secondGrade+thirdGrade)/3;
        if (average>=90){
            System.out.println("הממוצע שלך הוא "+average+" אתה מצטיין");
        }else if (average>=75){
            System.out.println("הממוצע שלך הוא "+average+" ואתה טוב ");
        }else if (average>=60){
            System.out.println("הממוצע שלך הוא "+ average+" ואתה צריך להשתפר");
        }else{
            System.out.println("הממוצע שלך הוא "+ average+" ואתה נכשלת השנה");
        }*/

        System.out.println("הכנס 5 ציונים:");
        double[] grades = new double[5];
        grades[0] = scanner.nextDouble();
        grades[1] = scanner.nextDouble();
        grades[2] = scanner.nextDouble();
        grades[3] = scanner.nextDouble();
        grades[4] = scanner.nextDouble();
        double average2 = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;
        double max = grades[0];
        double min = grades[0];
        if (grades[1] > max) max = grades[1];
        if (grades[2] > max) max = grades[2];
        if (grades[3] > max) max = grades[3];
        if (grades[4] > max) max = grades[4];
        if (grades[1] < min) min = grades[1];
        if (grades[2] < min) min = grades[2];
        if (grades[3] < min) min = grades[3];
        if (grades[4] < min) min = grades[4];
        System.out.println("הציון הכי נמוך שלך הוא: " + min);
        System.out.println("הציון הכי גבוהה שלך הוא: " + max);
        System.out.println("הממוצע שלך הוא: " + average2);
        if (average2 >= 90) {
            System.out.println("הממוצע שלך הוא " + average2 + " ואתה מצטיין");
        } else if (average2 >= 75) {
            System.out.println("הממוצע שלך הוא " + average2 + " ואתה טוב");
        } else if (average2 >= 60) {
            System.out.println("הממוצע שלך הוא " + average2 + " ואתה צריך להשתפר");
        } else {
            System.out.println("הממוצע שלך הוא " + average2 + " ואתה נכשלת השנה");
        }
    }
}