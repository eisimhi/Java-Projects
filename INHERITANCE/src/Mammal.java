//בגלל ש־Mammal יורש מ־Animal, הוא יכול להשתמש ישירות ב־getters וב־setters של Animal, בלי צורך ב־super. משתמשים ב־super רק כשצריך לקרוא לגרסה של האבא במפורש.
public class Mammal extends Animal {//   ככה כותבים שמחלקה יורשת ממחלקה אחרת אי אפשר שמחלקה תירש מ-2 או יותר מחלקות
    protected int milkProduction;
    protected int milkNeeded;
    public Mammal(int h, int w, String color, int mp,int mn){
        super(h,w,color);
        this.milkProduction=mp;
        this.milkNeeded=mn;
        /*this.weight=w;
        this.height=h;
        this.color=color+"";*/
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public void setMilkNeeded(int milkNeeded) {
        this.milkNeeded = milkNeeded;
    }

    public int getMilkProduction() {
        return milkProduction;
    }

    public void setMilkProduction(int milkProduction) {
        this.milkProduction = milkProduction;
    }
}
