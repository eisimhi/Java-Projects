import java.util.Scanner;
public class PizzaOrder {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int smallPizza = 25;
        int BigPizza =40;
        int topping =5;
        int top=0;
        int sum=0;
        System.out.println("Enter pizza type(Small=1,Family=2)");
        int x =input.nextInt();
        if (x>2||x<1){
            System.out.println("Error-pizza type must be 1 or 2");
            System.exit(67);}
        System.out.println("Enter quantity(1 or 2)");
        int amount =input.nextInt();
        if (amount>2||amount<1){
            System.out.println("Error-quantity must be 1 or 2");
            System.exit(67);}
        if (amount==1){
            System.out.println("Add toppings?(0=no,1=yes)");
            top =input.nextInt();
            if (top<0||top>1){
                System.out.println("Error-topping option must be 0 or 1");
                System.exit(67);
            }
        }else{
            System.out.println("Add Toppings?(0=no,1=both,2=one)");
            top=input.nextInt();
            if (top>2||top<0){
                System.out.println("Error-topping option must be 0,1 or 2");
                System.exit(67);
            }
        }
        if (top==1)
            top=2;
        if (x==1)
            sum=smallPizza*amount+(top*topping);
        else
            sum=BigPizza*amount+(top*topping);
        System.out.println("Total price: "+sum);
    }
}