import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        person p = new person();
        System.out.println(p);
        Car c1 = new Car();// הcar הראשון שיצרתי ושם כבר שמתי את הפרטים של המכונית אז אני לא צריך לכתוב כלום
        Car c2 = new Car(50000, 7, 250, "Red", "Honda");// אני יצרתי CAR בכיתה אחרת ושם אני שמתי משתנים אבל לא הגדרתי מה כל משתנה עושה ועכשיו אני מגדיר אותו
        Car c3 = new Car(c1);//החיקוי של המכונית שיצרתי בCLASS CAR
        // אני לא יכול לכתוב c1=c3 כי אז הם ישוו ערכים וזה יצביע על אותו מקום בזיכרון ואני רוצה להשוות את התכונות שלהם ואז אם אני אשנה משהו C1 זה ישנה את אותו דבר גם בC3
        c2.setPrice(2000000);//אני משנה את המחיר של המכונית השנייה מ50000 ל2000000
        System.out.println(c2.getPrice());// אני מדפיס את המחיר
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        person p2 = new person(180, "1243213", c1);
        System.out.println(p2);
        Car c4 = new Car(p.getCar());


        Car[] car2 = new Car[10];//אני מייצר פה 10 מכוניות שונות אבל אף אחת מהם לא קיימת ולכן אם אני אנסה לשנות משהו בהם ולהדפיס את הדבר הזה התוכנית תעשה בעייה שנקראת NULL כי המשתנה לא קיים כדי לתקן את זה צריך לייצר אחד ואז אותו אפשר לשנות
        car2[2] = new Car();
        car2[2].setPrice(676767);
        System.out.println(car2[2].getPrice());

        for (int i = 0; i < car2.length; i++)
            car2[i] = new Car();// כשאני כותב I זה כמו נעלם בחשבון והנעלם הזה מתייחס לכל האיברים שנמצאים בתוך CAR2 אז אם I=0 אז CAR2[0] וכו'
        for (int i = 0; i < car2.length; i++)
            System.out.println(car2[i].getId());//מביא לי את הID של כל אחד מהמכוניות במערך

        System.out.println(car2[2].getCompany());
        car2[2].setCompany("idk");
        System.out.println(car2[2].getCompany());

        c1.setId(5);
        System.out.println(c1.getId());
        in.close();
    }
}