public class Pastry extends Product {

    // כשכותבים EXTENDS בעצם מצהירים שהכיתה הזאת היא יורשת של הכיתה השנייה שכתבת ואז PASTRY יכולה לקבל את כל מה שיש לPRODUCT ו"לרשת" אותם ממנו כאילו היא הבת שלו והיא קיבלה את אותו דנ"א מהאבא

    public Pastry(String name, double price){
        super(price, name);
        // בעצם בגלל שהמחלקה של PASTRY היא בעצם יורשת של PRODUCT ובגלל ששמרתי משתנים בשם NAME וPRICE על PROTECTED בPRODUCT אז PASTRY ירשה אותם והיא יכולה להשתמש בהם
        // המילה SUPER זאת מילה שאומרת שאתה בתוך מחלקת בן, אתה פונה לחלק של האבא.

    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public String renamePastry(String newPastry){
        this.name=newPastry;
        return newPastry;
    }
}
