/*import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        // Scanner זה פעולה שמאפשרת לקבל קלט מהמשתמש,
        //Scanner(System.in)  אומר ש המידע שאתה תכתוב יכנס לתוכנית זה נותן לJAVA לקבל מידע מהUSER אחרת JAVA לא הייתה יכולה לספק תשובה אלא רק להדפיס
        System.out.println("Hello dear user, please enter your grade: ");
        byte grade = num.nextByte();
        // NUM.NEXTBYTE אומר שהמספר שהמשתמש שם יהפוך להיות משתמש מסוג BYTE וישמור אותו במערכת
        System.out.println("Your grade will be: " + grade);

        Scanner num2 = new Scanner(System.in);
        System.out.println("Please enter your bigger grade: ");
        int biggerGrade = num2.nextInt();
        System.out.println("Your Bigger Grade Will Be: "+ biggerGrade);
        System.out.println("Your Combined Grade Will Be: " + (grade+biggerGrade));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello dear user, Please enter your name");
        String name = scanner.nextLine().trim();
        // משתמשים בNEXT LINE אם רוצים לקבל מילים\ אותיות מהמשתמש
        //  אם כותבים TRIM המערכת תמחק רווחים חיצונים
        System.out.println("Your name is " + name);


    }
}*/

import javax.print.DocFlavor;

/*import java.util.Scanner;

class Main1{
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        System.out.println("Please Enter A Number");
        byte number = num.nextByte();
        System.out.println(number);
        System.out.println("Please Enter A Bigger Number");
        int number2 = num.nextInt();
        System.out.println(number2);
        System.out.println(number+number2);
        System.out.println("Please Enter Your Name");
        num.nextLine();
        String name = num.nextLine().trim();
        System.out.println(name);
        System.out.println("Please Enter A Different Number");
        int number3 = num.nextInt();
        System.out.println(number3*2);
    }
}*/
/*import java.util.Scanner;

class test{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        byte num1 = scanner.nextByte();
        int num2 =scanner.nextInt();
        int num3 =scanner.nextInt();
        double num4 = num1+num2+num3;
        System.out.println("Your sum is: " +num4);
        System.out.println("Your Average is: " +num4/3);
        System.out.println("Please Enter Your Name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Please Enter Your Nickname");
        String nick = scanner.nextLine();
        System.out.println(name.length());
        System.out.println(nick.toUpperCase());
        System.out.println("Your Full Name is: "+ name+" "+ nick);
        System.out.println("Please Enter Two More Numbers");
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int numTwo = Math.max(num5,num6);
        System.out.println(numTwo);
        scanner.close();


    }
}*/
