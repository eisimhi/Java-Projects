import java.util.Scanner;

public class Product implements Loggable {
    private String itemName;
    private int price;

    @Override
    public void logInfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("what is the name of your item");
        String item=in.nextLine();
        this.itemName=item;
        System.out.println("what is the price of the item?");
        int price = in.nextInt();
        if (price>0){
            this.price=price;
        }
        System.out.println("The name of the item: "+this.itemName+" The price: "+this.price);
    }
}
