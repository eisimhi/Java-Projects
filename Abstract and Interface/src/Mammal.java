public abstract class Mammal extends Animal {// כל מחלקה שיורשת ממחלקה מופשטת חייבת גם היא להיות מופשטת
    protected int milkProduction;
    protected int milkNeeded;
    public Mammal(int h, int w, String color, int mp,int mn){
        super(h,w,color);
        this.milkProduction=mp;
        this.milkNeeded=mn;
        this.weight=w;
        this.height=h;
        this.color=color+"";
    }
    public abstract void makeSound();

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
