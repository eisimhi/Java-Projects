public class Main {
    public static void main(String[] args) {
        CoffeeOrder c = new CoffeeOrder("latte",14.0);
        Pastry p = new Pastry("Croissant",999);
        BreakfastDeal b = new BreakfastDeal(c,p);
        System.out.println(b.toString());
        Product pt = new Product(20.20,"coffee");
        SpecialPastry sp = new SpecialPastry("milk","coffee",20.20);
        sp.describe();
        
    }
}