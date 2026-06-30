public class Dog extends Mammal implements Activities{
    private String type;
    private String name;
    private boolean isNatural;

    public Dog(int h,int w,String color,int mp,int mn,String type,String name,boolean isNatural){
        super(h, w, color, mp, mn);
        this.type=type+"";
        this.name=name+"";

        this.isNatural=isNatural;

    }
    public void makeSound(){
        System.out.println("woof");
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

    @Override
    public void poop() {// אם יש פעולה בINTERFACE היא חייבת להיות מבוצעת במחלקה גם
        System.out.println("pooping near a tree");
    }
}
