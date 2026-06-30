
public class CoffeeOrder extends Product {


     public CoffeeOrder(String name, double price){
       super(price, name);
    }
    public String toString(){
         return "Drink: "+name+" , Price: "+price;
    }

    public double getPrice() {
        return price;
    }

    public String getNameOfOrder() {
        return name;
    }
    public double upgradeOrder(double addedPrice){
         double newPrice = addedPrice+price;
         return newPrice;
    }
}
