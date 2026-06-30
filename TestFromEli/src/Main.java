import java.text.NumberFormat;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[]args ){
      /*  Scanner name = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String userName = name.nextLine();

        Scanner money = new Scanner(System.in);
        System.out.println("Enter The Amount of Money That You Would Like To Earn: ");
        int userMoney = money.nextInt();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formattedMoney = currency.format(userMoney);
        System.out.println("Your Name Is: "+ userName +" And You Wish To Earn: "+ formattedMoney);
        */


        Scanner name2 = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String userName2 = name2.nextLine();

        Scanner money2 = new Scanner(System.in);
        System.out.println("Your Tax Presentege: ");
        int userMoney2= money2.nextInt();
        NumberFormat currency2 = NumberFormat.getPercentInstance();
        String presentage = currency2.format(userMoney2/100.0);
        System.out.println("Your Name Is: "+ userName2 +" And You Pay: "+ presentage +" Tax");


    }

}
