
import java.awt.*;
import java.util.Date;

    public class Main1{
    public static void main(String[] args){
        byte num = 31; //-128,127
        short shrt = 20000; //-32k, 32k
        int boo = 150000000; //-2B, 2B
        float price = 10.88F;
        char letter = 'A';
        Boolean isGood = true;
        System.out.println(shrt+boo);
        long bigNum = 150020000;
        long bigNum2 = 1000000;
        System.out.println(bigNum+bigNum2);
        // סוגים של משתנים פרימיטיבים-
        //long צריך להוסיף L בסוף
        //float כשמשתמשים בסוג המשתנה float, המספר שמקצים לו חייב להיות מספר דצימלי (מספר עשרוני) עם האות f או F בסופו.
        //char גרשיים מהסוג הזה''
        //byte
        //short
        //int
        //double
        //Boolean-חייב להיות TRUE או FALSE

        byte num2 = num;
        System.out.println(num2);
        //משתנה רפרנס
        Point point1 = new Point(1,1);// נקודה על גרף
        Point point2 = point1;
        point1.x = 2;
        point1.y = 2;
        System.out.println(point2);
        // משתנים רפרנסים
        String s = "Evyatar";
        System.out.println(s);

        Date now = new Date();
        System.out.println("date and time now" + now );



    }

}
