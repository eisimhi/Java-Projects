/*import java.util.Arrays;

public class Main {
    public static void main (String [] args){
        int[] numbers = new int[6];
        numbers[0] = 44;
        numbers[1] = 22;
        numbers[2] = 6;
        numbers[3] = 17;
        numbers[4] = 27;
        numbers[5] = 2;
        Arrays.sort(numbers);//לסדר את המספרים לפי סדר גודל
        System.out.println(Arrays.toString(numbers));// ככה אפשר להדפיס ערכים,אם לא יהיו לי את כל הערכים התוכנה תגדיר אותם כ0


        int[] numbers1 = {44,22,6,17,27,2};//צורה קלה יותר מאשר הצורה שיש למעלה
        System.out.println(numbers1 [2]);// כדי להדפיס ספרה יחידה מתוך המערך כותבים את המיקום של המספר וזה ידפיס אותו
        numbers1[2]=2;
        System.out.println(numbers1[2]);
    }
}
*/

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[]args){
        Random r =new Random();//מייצר מספרים אקראיים

        int countEven=0,countOdd=0;

        int[] grade = new int[100];

         for(int i =0;i< grade.length;i++){//הLENGHT אומר שהלולאה תמשיך כמה פעמים שצריך עד שזה יגיע לסיום למערך:בגלל שהלולאה פה היא עד 100 (0-99) אז הלולאה תמשיך לרוץ עד 99
        grade[i]=0;// בהתחלה I שווה ל0 אז גם המיקום במערך וגם המספר במערך יהיו שווים ל0 ואז כל פעם שהלולאה חוזרת על עצמה שניהם יעלו ב-1
        grade[i]=r.nextInt(100)+1;//next.Int(100)  אומר שאני רוצה שהתוכנה תתן לי מספר אקראי מ0-99 כולל 0 אבל לא כולל  100 והפלוס 1 אומר שמוסיפים 1 למספר האקראי אז במקום לקבל מ0-99 אנחנו מקבלים מ1-100
         }
        for (int i = 0;i< grade.length;i++){
            System.out.println(grade[i]);
            if (grade[i]%2==0){
                countEven++;
            }else{
                countOdd++;
          }
        }
        System.out.println("Zugi= "+ countEven);
        System.out.println("Not Zugi= "+countOdd);

    }
}