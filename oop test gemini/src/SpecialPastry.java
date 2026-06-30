public class SpecialPastry extends Pastry {
    private String topping;
    public SpecialPastry(String topping, String name, double price){
        super(name, price);
        this.topping=topping;
    }
    public void describe() {
        System.out.println("This is a product named: " + name);
    }

}
