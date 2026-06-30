import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("כמה בקבוקים של קולה יש לך לארוז? ");
        int bottels = scanner.nextInt();
        int boxes = bottels / 6;
        int sherit = bottels % 6;
        System.out.println("נשאר לך: "+sherit+" בקבוקי קולה ");
        int cola = 6-sherit;
        System.out.println("אתה צריך עוד: "+ cola+" בשביל שיהיה מלא");

        System.out.println("כמה חברים אתם?");
        int friends = scanner.nextInt();
        System.out.println("כמה סוכריות תפסתם?");
        int candies = scanner.nextInt();
        int devison = candies/friends;
        System.out.println("כל חבר מקבל: "+ devison+" סוכריות");
        int sherit2 = candies%friends;
        System.out.println("נשארו "+sherit2+" סוכריות");

        System.out.println("מה אתה רוצה לקנות?");
        scanner.nextLine();
        String item =scanner.nextLine();
        System.out.println("מה שער הדולר היום?");
        double USD =scanner.nextDouble();
        System.out.println("כמה "+item+" עולה בדולרים");
        int priceUSD=scanner.nextInt();
        System.out.println("המוצר שלך עולה "+priceUSD*USD+" שקלים");

        System.out.println("כמה אחוזי הנחה יש על המוצר?");
        int discount = scanner.nextInt();
        System.out.println("כמה עולה המוצר שלך בשקלים?");
        int shekel = scanner.nextInt();
        int hanacha = (shekel*discount)/100;
        System.out.println("המוצר שלך עולה "+hanacha);
        int finalPrice = shekel-hanacha;
        System.out.println("המחיר ירד ב: "+finalPrice+" שקלים ");

    }
}