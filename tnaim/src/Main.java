import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("הכנס מספר:");
        int in = scanner.nextInt();
        if (in>0){
            System.out.println("המספר גדול מ-0");
        }else{
            System.out.println("המספר קטן מאפס");
        }
        System.out.println("בבקשה הכנס 2 מספרים:");
        int input = scanner.nextInt();
        int input3 = scanner.nextInt();
        if (input>input3){
            System.out.println("המספר הראשון גדול מהשני");
        } else if (input==input3){
            System.out.println("המספרים שווים");
        }else{
        System.out.println("המספר השני גדול מהראשון");
        }
        System.out.println("בן כמה אתה?");
        byte age = scanner.nextByte();
        if (age<18){
            System.out.println("אתה צעיר מדי בשביל להצביע");
        }else{
            System.out.println("אתה מספיק גדול כדי להצביע");
        }
        System.out.println("מה הסכום של הקנייה שלך:");
        int price = scanner.nextInt();
        if (price>=200){
            System.out.println("אתה מקבל הנחה של 10 אחוז והמחיר החדש יהיה"+ (price-(price*0.1)));
        }else{
            System.out.println("קנייה נעימה");
        }
        int password = 7429;
        System.out.println("הכנס סיסמה:");
        int inPassword = scanner.nextInt();
        if (inPassword==password){
            System.out.println("סיסמה נכונה");
        }else{
            System.out.println("סיסמה שגויה");
        }
        //q1
        System.out.println("כמה דקות עבדת עבדת בשבוע האחרון?");
        int minute = scanner.nextInt();
        int hours =(minute/60);
        if (hours==1){
            System.out.println("אתה עבדת שעה");
        } else if (hours>1) {
            System.out.println("אתה עבדת:"+hours+" שעות");
        }else{
            System.out.println("לא עבדת אפילו שעה");
        }
        byte payCheck = 35;
        int salary = hours*payCheck;
        System.out.println("אתה הרווחת: "+salary+" שקלים");
        if (salary==700){
            System.out.println("תתפנק");
        }else{
            System.out.println("עליך להגיע לעבודה יותר");
        }
        //q2
        System.out.println("מה סכום ההזמנה?");
        int money = scanner.nextInt();
        System.out.println("מהי כמות הטיפ שהושאר?");
        int tip = scanner.nextInt();
        if (tip>=money*0.15){
            System.out.println("לקוח מועדף");
        }else{
            System.out.println("פעם הבאה לנפנף אותו");
        }
    }
}
