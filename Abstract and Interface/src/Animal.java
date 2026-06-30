
public abstract class Animal {//  הabstract אומר שהמחלקה היא תכנון ולכן אי אפשר ליצור ממנה אובייקטים(NEW ANIMAL) היא מגדירה כמו שרטוט שממנו ירשו המחלקות שלה
    protected int weight;
    protected int height;
    protected String color;

    public Animal(int weight, int height, String color){
        this.weight=weight;
        this.height=height;
        this.color=color+"";
    }
    public abstract void makeSound();// זה תכנון לשיטה שחייבת להיות בשיטות שיורשות אותה ובגלל שחיה זה משהו דיי כללי אתה לא יודע איזה רעש החיה תעשה ולכן אתה בונה גם שיטות כאלה בשאר החיות שיורשות אותה
    //הסיבה ששמים שיטה מופשטת ולא פשוט יוצרים את השיטה כרגיל בכל מחלקה זה כדי להגיד לך"אם אתה רוצה ליצור חיות שיורשות מהמחלקה הזאת חייב להיות להם את השיטה הזאת" וזה לא רק לגבי השיטות זה גם לגבי השדות:גובה, צבע וכו'- זה גם אומר שלחיות שיורשות ממנה חייב להיות את השדות האלה יכול להיות שזה יהיה שונה אבל הם חייבים שיהיה להם את זה

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
