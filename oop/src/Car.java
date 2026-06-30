
public class Car {
    public static int totalId=0;
    // בלי STATIC כל אובייקט מקבל עותק נפרד של המשתנה אבל אם יש STATIC זה אומר שיש משתנה אחד שהוא משמש את כל האובייקטים, אם אני לא משתמש בזה ואני משנה את TOTAL ID אז זה ישתנה אצל כל אובייקט שמשתמש בו לפי מה שיש בו ואם אני משנה אחד האחרים לא ישתנו אבל אם יש STATIC ואני משנה אותו זה ישתנה אצל כל האוביקטים

    private int price;
    private int id;
    private int numberOfSits;
    private int maxSpeed;
    private String color;
    private String company;
    // בגלל שהגדרתי את כל אחד מהם בתור PRIVATE אז אם אני אלך לMAIN אני לא אוכל לשנות את המשתנים האלה אם הם היו PUBLIC הייתי יכול לשנות אותם
    public Car (){//   אני יוצר מחלקה בשם CAR ובתוכה יש בנאים שהם בונים את המחלקה וכל אחד מהם נחשב לבנאי(בעצם כל מה שנמצא בסוגריים המסולסלות) וכל בנאי אחראי לבנות את המחלקה בצורה אחרת
        // הCAR הוא מחלקה, תבנית ליצרית אובייקט
        //בגלל שלא הגדרתי מה המחלקה הזאת צריכה כדי להתקיים אז אם אני אי פעם אקרא לCAR אז זה נחשב לאופצית הDEFAULT ואם אני כותב NEW CAR() אז זה ישר ילך לפה
        totalId++;//פה הID יהיה שווה ל1
        this.id =totalId;//המשתנה TOTALID הוא משתנה סטטי שסופר כמה מכוניות נוצרו בכל פעם שנוצרת מכונית חדשה זה מעלה את הערך של TOTALID ואז נותן לאובייקט ID את הערך שלו
        this.price=150000;//כשאני כותב THIS המילה מתייחסת לאובייקט שלך שאליו השיטה\הבנאי מתייחסים בעצם אם אני כותב THIS.XXX אז זה מתייחס לשדה למעלה עם אותו השם
        this.numberOfSits=5;
        this.maxSpeed=200;
        this.color="Black";
        this.company="Toyota";
    }
    public Car(int price,int nos,int max,String clr,String cmp){
        this.price=price;
        totalId++;//פה הID יהיה שווה ל2
        this.id =totalId;
        this.numberOfSits=nos;
        this.maxSpeed=max;
        this.color=clr;
        this.company=cmp;

    }
    public Car(Car c){// זה מה שנקרא בנאי מחקה הוא יוצר אוביקט שיש לי כבר אבל שומר אותו בתור משתנה אחר
        totalId++;//פה הID יהיה שווה ל3
        this.id =totalId;
        this.price=c.price;
        this.numberOfSits=c.numberOfSits;
        this.maxSpeed=c.maxSpeed;
        this.company=c.company+"";
        this.color=c.color+"";// ה+"" משמש כדי לוודא שהעותק של STRING פה הוא חדש ונפרד ולא הפניה לאותו STRING המקורי

    }
    public int getPrice(){// אם כותבים INT  זה אומר שהמתודה מחזירה מספר שלם
        // בגלל ש־price מוגדר בתור private, אי אפשר לגשת אליו ישירות מבחוץ, ולכן משתמשים במתודה getPrice() כדי לקבל את הערך של המשתנה price — כלומר, לקרוא את הנתון בלי לשנות אותו.
        return this.price;// נגיד המחיר הוא 1000 אז המתודה הזאת תכתוב לי 1000
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfSits() {
        return numberOfSits;
    }

    public void setNumberOfSits(int numberOfSits) {
        this.numberOfSits = numberOfSits;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(int value){// כשמישהו ישתמש במתודה הזאת המתודה תחזיר מספר שלם(INT) יוצרים משתנה חדש בשם VALUE ובו שומרים את המחיר החדש ואז אפשר לשנות את המחיר למרות שהוא PRIVATE
        this.price=value;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int carId){
        this.id=carId;
    }
    public String toString() {//מתי שאני מריץ את הפעולה TO STRING זה ידפיס לי את כל זה אוטומטית
        return
                "Price=" + price +"\n"+
                " Number Of Sits=" + numberOfSits +"\n"+
                " Max Speed=" + maxSpeed +"\n"+
                " Color='" + color + '\'' +"\n"+
                " Company='" + company + '\'' +"\n"+
                "ID="+this.id+"\n";

                }
    }
