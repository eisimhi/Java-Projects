public class Product {

    protected double price;
    protected String name;
    // המילה protected אומרת שרק המחלקה עצמה והילדים שלה וגם כל מחלקה באותה חבילה יכולים לגשת אליהם
    //  יורשים או ילדים ב-Java הם מחלקות שמקבלות תכונות ושיטות ממחלקה אחרת


    public Product(double price, String name){
        this.price=price;
        this.name=name;
    }

    public double getPrice() {
        return price;
    }
}
