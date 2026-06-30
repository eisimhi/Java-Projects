import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int result = Math.round(1.1F);// אם רוצים לעגל מספר צריך להשתמש בMATH.ROUND וזה יעגל למספר השלם הכי קרוב אליו
        int result2 = (int)Math.ceil(1.2F);//לכתוב CEIL אומר שזה יעגל כלפי מעלה ואם רוצים לקבל מספר שלם בלי נקודה צריך לכתוב (INT)  אם לא יכתבו INT בסוגריים JAVA תביא לי את התשובה כמספר עשרוני אבל אי אפשר לשים מספר עשרוני בתוך INT
        int result3 = (int)Math.floor(1.9F);//לכתוב FLOOR יעגל את המספר בסגוריים למספר השלם הכי נמוך שקרוב אליו
        int result4 = Math.min(1,0);//מינימום ידפיס את הערך המינימלי בין שני מספרים
        int result5 = Math.max(100,2);// מקסימום ידפיס את הערך המקסימלי בין שני המספרים
        double result6 = Math.random();//אם כותבים RANDOM צריך להשתמש בDOUBLE וזה יתן מספר עשרוני רנדומלי שקטן מ1
        double result7 = 5+ Math.random();//אם כותבים + או - (לפני המספר) ואז מספר אז המספר העשרוני יכיל את המספר שנכתב בספרה הראשונה
        int result8 = (int)Math.round(Math.random()* 100);// המספר שמגיע אחרי הRANDOM קובע מה יהיה התווך של המספרים במקרה הזה זה 0 עד 100 אבל זה לא יכלול את 100 ולכן כותבים ROUND שזה מעגל את המספר הכי גדול למספר עגול שהכי קרוב אליו ולכן זה עכשיו כן יכלול את 100
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
    }
}
 class MAIN3{
    public  static void main(String[]args){
        int result = Math.round(2.7F);
        System.out.println(result);
        int result2 = (int) Math.ceil(3.2F);
        System.out.println(result2);
        int result3 = (int) Math.floor(4.9F);
        System.out.println(result3);
        int result4 = Math.min(3,7);
        int result5 = Math.max(3,7);
        System.out.println(result5);
        System.out.println(result4);
        double result6 = Math.random();
        System.out.println(result6);
        double result7 = 5+Math.random();
        System.out.println(result7);
        double result8 = (int) Math.round(Math.random()*100);
        System.out.println(result8);



    }
}
 class Main2 {
    public static void main (String[] args){
       int result = 10+3;
       int result2 = 10-3;
       int result3 = 10*3;
       float result4 = 10/3F;
       double result5 = (double)10/(double)3;//אם משתמשים בDOUBLE כדי לעשות תרגיל חילוק צריך לכתוב DOUBLE לפני כל מספר
        String str = "1";// קלט מהמשתמש תמיד מגיע כטקסט (String), צריך להמיר למספר אם רוצים לחשב
        String str2 = "1.1";
        result++; //כותבים ++ אם רוצים להעלות את הערך המקורי באחד
        result2--;//ו-- אם רוצים להוריד אחד
        System.out.println(result+Integer.parseInt(str));// אם כותבים STRING ורוצים לחבר את הערך של הSTRING לערך אחר צריך לכתוב INTEGER.PARSEINT() ובתוך הסוגריים לכתוב את השם של הערך שנמצא בתוך STRING
       System.out.println(result2+Double.parseDouble(str2));//אם המספר שיש בתוך המשתמש STRING הוא לא מספר טבעי(שבר) אז צריך לכתוב במקום INTEGER,DOUBLE ואז זה יכול להדפיס את התוצאה
       System.out.println(result3);
       System.out.println(result4);
        System.out.println(result5);


    }
}
class MAIN1{
    public static void main (String[]args){
        System.out.println(8+12);
        System.out.println(8-12);
        System.out.println(8*12);
        float q2 = 10/3F;
        System.out.println(q2);
        byte x = 1;
        x++;
        x--;
        System.out.println(x);
        String str = "15";
        int number = Integer.parseInt(str);
        String str2 = "2.5";
        double number2 = Double.parseDouble(str2);
        number = number+5;
        number2 = number2*4;
        System.out.println(number);
        System.out.println(number2);

    }
}
class Main4{
    public static void main(String[]args){
        int n1=15,n2=6;
        System.out.println((double) n1/n2);// הדאבל בסוגריים הופך את התוצאה לדאבל במקום INT
         int t = n1%n2;// כשכותבים % זה נותן את השארית לדוגמא במקרה הזה 6 נכנס לתוך 15 פעמיים אז השארית תהיה 3 וזה יכתוב לי 3
         System.out.println(t);

    }

}

 class MATH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("put two numbers");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double pow1 =Math.pow(x,y);
        double pow2 =Math.pow(y,x);
        System.out.println(Math.max(pow1,pow2));
        System.out.println("put a negative decimal number");
        double d =input.nextDouble();
        System.out.println(Math.abs(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d));
        System.out.println("put a number");
        int n = input.nextInt();
        System.out.println(Math.sqrt(n));
        if (n%n==0)
            System.out.println("המספר הוא ריבוע מושלם");
        else
            System.out.println("המספר הוא לא ריבוע מושלם");

        System.out.println("give me two decimal numbers");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        double number1 = num1 - (int) num1;
        double number2 = num2 - (int) num2;

        System.out.println(number1);
        System.out.println(number2);

        if (number1 > number2)
            System.out.println(number1);
        else
            System.out.println(number2);

        System.out.println("הכנס אורך");
        double l1 = input.nextDouble();
        System.out.println("הכנס רוחב");
        double l2 = input.nextDouble();
        double a = Math.sqrt(Math.pow(l1,2)+Math.pow(l2,2));
        System.out.println(a);

        System.out.println("put 3 numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int sum = n1+n2+n3;
        int small = Math.max(n1,Math.max(n2,n3));
        int large = Math.min(n1,Math.min(n2,n3));
        int middle = sum-large-small;
        System.out.println(middle);*/

        System.out.println("put 4 numbers");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = x2-x1;
        int y3 = y2-y1;
        double distance = Math.sqrt(Math.pow(x3,2)+Math.pow(y3,2));
        System.out.println(distance);




    }
}
