public class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String name, double price, double discount){
        super(price, name);
        this.discount=discount;

    }
    public double getPrice(){
        return super.getPrice()-this.discount;
    }

}
