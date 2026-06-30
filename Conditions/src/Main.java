import java.util.Scanner;

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        boolean checkEven;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        number = in.nextInt();
        checkEven=(number%2==0);
        // זה אומר שאם ערך החלוקה של המספר בשתיים יהיה שווה 0 אז זה יהיה נכון ואם זה לא יהיה 0 אז זה יהיה לא נכון
        // אם יש רק = אחד זה נקרא הכלה לדוגמא אני מכיל משתנה מסוים עם מספר INT 1=5 אז בעצם המשתנה 1 שווה ל5
        // אם יש == זה בדיקת שוויון
        //יש גם את הסימן לא שווה=!  אם אין שוויון
        if (checkEven){// לא חייב לכתוב == TRUE אפשר פשוט לא לכתוב כלום וזה יהיה אותו דבר
            System.out.println("THIS NUMBER IS even");
        }else{
            System.out.println("THIS NUMBER IS odd!");
        }
        in.close();
        if (number>6){
            System.out.println(number + " is bigger than 6");
        }else if (number==6){// else if זה פשוט דרך להמשיך את התנאי
            System.out.println(number + " is equal to 6");
        }else{
            System.out.println(number + " is smaller than 6");
        }
        System.out.println(checkEven);// יחזיר לי אמת או שקר

    }
}*/
class Main1{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num1 = scanner.nextInt();
        boolean checkZugi;
        checkZugi=(num1%2==0);
        if (checkZugi){
            System.out.println("This Number is Even");
        }else{
            System.out.println("This Number is Odd");
        }
            if (num1>6){
                System.out.println("This number is bigger than 6");
            }else if (num1==6){
                System.out.println("This number is equal to six");
            }else{
                System.out.println("This number is smaller than six");
            }
            System.out.println(checkZugi);
        System.out.println("Enter a second number: ");
        int num2 = scanner.nextInt();
        boolean checkEven2 = (num2 % 2 == 0);

        // בדיקה של שני המספרים יחד
        if (checkZugi && checkEven2) { // שניהם זוגיים
            System.out.println("Both even");
        } else if (!checkZugi && !checkEven2) { // שניהם אי-זוגיים
            System.out.println("Both odd");
        } else { // אחד זוגי והשני אי-זוגי
            System.out.println("One even, one odd");
            // הסימנים && ביחד אומרים ו בעצם זה דרך לכתוב ו החיבור
        }
            scanner.close();
    }
}