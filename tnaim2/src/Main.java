import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*System.out.println("תכתוב מספר בין 1-1000");
        int num =s.nextInt();
        if (num<10|| num<=0)
            System.out.println("מספר חד ספרתי");
        else if (num>=10&&num<=99)
            System.out.println("מספר דו ספרתי");
        else if (num>=100&&num<=999)
            System.out.println("מספר תלת ספרתי");
        else
            System.out.println("ההוראות לא לפי המספר");

        String agree = "כן";
        System.out.println("האם אתם רוצים כרטיסים להופעה?");
        String word=s.nextLine();
        if (word.contains("כן")){
            System.out.println("בן כמה אתה?");
            int age = s.nextInt();
            if (age>=65){
                System.out.println("מחיר כרטיס 50 שקל");
            }else if (age<18){
                System.out.println("מחיר כרטיס 80 שקל");
            }else if (age>=18&&age<=64){
                System.out.println("האם אתה חייל או סטודנט?");
                s.nextLine();
                String word2=s.nextLine();
                if (word2.contains("כן")){
                    System.out.println("מחיר כרטיס שמונים שקל");
                }else{
                    System.out.println("מחיר כרטיס 100 שקלים");
                }
            }
        }else
            System.out.println("חבל");

        System.out.println("כמה חבילות פופקורן אתה קונה?");
        int pop = s.nextInt();
        if (pop==1){
            System.out.println("המחיר הוא 20 שקל");
        }else if (pop==2){
            System.out.println("המחיר הוא 15 שקל");
        }else if (pop==3){
            System.out.println("המחיר הוא 12 שקל");
        }else if (pop==4){
            System.out.println("תיקח בחינם לא היה כתוב בדף כמה 4 עולים");
        }else if (pop==5){
            System.out.println("גם אתה זה לא היה כתוב");
        }else if (pop>5) {
            System.out.println("אסור לקנות מעל לחמש חבילות של פופקורן");

        }*/

        System.out.println("תבחר שני מספרים מ1-100");
        int number = s.nextInt();
        int number2 = s.nextInt();
        if (number < 0 || number > 100&&number2<0||number2>100){
            System.out.println("אתה לא בחרת מספרים מ1-100, תבחר מספרים מ1-100");
        return;
    }

                if (number<10&&number2<10){
                System.out.println("שני המספרים מתחת ל10");
            }else if (number>10&&number2>10){
                System.out.println("שני המספרים גדולים מ-10");
            }else {
                System.out.println("אחד גדול מ-10 ואחד קטן מ-10");
            }

    }
}
