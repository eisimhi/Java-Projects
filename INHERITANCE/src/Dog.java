public class Dog extends Mammal{//כשכותבים SUPER אז אנחנו אומרים שDOG הוא סוג שלMAMMAL ולכן צריך ליצור גם  MAMMAL אותו הדבר לגבי ANIMAL
    private String type;
    private String name;
    private boolean isNatural;

    public Dog(int h,int w,String color,int mp,int mn,String type,String name,boolean isNatural){
        super(h, w, color, mp, mn);//שולחים לSUPER את מה שהוא מקבל ממחלקות אחרות
        this.type=type+"";
        this.name=name+"";

        this.isNatural=isNatural;

    }

    public boolean isNatural() {
        return isNatural;
    }

    public void setNatural(boolean natural) {
        isNatural = natural;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
