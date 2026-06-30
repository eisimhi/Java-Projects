import java.util.Scanner;

public class BreakfastDeal {
    private CoffeeOrder c1;
    private Pastry p1;


    public BreakfastDeal(CoffeeOrder c2,Pastry p2){
        this.c1=c2;
        this.p1=p2;

    }
        public double getTotalPrice(){
            double z1=c1.getPrice();
            double z2=p1.getPrice();
            double z3=z2+z1;
            return z3;
        }
        public String toString(){
        return "Coffee: " +c1.getNameOfOrder()+"\n"+
                "Pastry: "+p1.getName()+"\n"+
                "Total Price: "+getTotalPrice();
        }
        public double applyDiscount(){
        Scanner in =new Scanner(System.in);
        System.out.println("how much discount?");
        double dis=in.nextDouble();
        double newPrice = (getTotalPrice())*dis;
        return newPrice;

        }
}
