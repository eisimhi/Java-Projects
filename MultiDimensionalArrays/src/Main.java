import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Random;

/*public class Main{
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];//הסוגריים הראשונים מחליטים כמה מערכים יהיה והשניים מחליטים כמה מספרים יהיה בכל מערך
        System.out.println(Arrays.deepToString(numbers));//כשיש מערך עם יותר ממימד אחד [][] צריך לכתוב deepToString כדי להדפיס את התוכן שלהם בצורה ברורה
        int[][] numbers1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}//אם כותבים את זה ככה אז אפשר להחליט מה יהיה בכל מערך
        };
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(numbers1[0][2]);//
        // כדי להדפיס מקום מסוים בתוך מערך אני בוחר את השורה קודם כל ואז את המיקום במערך במקרה הזה זה שורה מספר 0(או השורה הראשונה) ומיקום 2 (שזה מספר 3)

    }
}*/
class ArraysIn2d {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Random random =new Random();
        for (int i = 0; i < matrix.length; i++) {// כשאני כותב LENGTH על מערך דו ממדי אני מתכוון למספר השורות שיש לו במקרה הזה זה יהיה 10 ובגלל שהגדרתי את הINT בתור I אז זה יהיה I LENGTH אם הייתי כותב אות אחרת הייתי צריך לכתוב אות אחרת ואז LENGTH
            for (int j = 0; j < matrix[i].length; j++) {// אם כתוב LENGTH [I] זה אומר שאני מתייחס לא לשורות אלא לכמה מקומות יש בכל שורה במקרה הזה יש 10 מקומות בכל שורה
                matrix[i][j] =i+j;
                // האות I עובדת על מספר השורות והאות J עובדת על מספר האיברים בכל שורה וכל פעם שהלולאה רצה J מתקדם 1 עד שהוא מגיע לסוף מתי שהוא מגיע לסוף I מקבל 1 ואז J מתחילה מחדש אבל על שורה אחרת
                // בגלל שכתוב  matrix[i][j] זה אומר שהלולאה תעבור קודם על הI ואז על הJ אם זה היה matrix[J][I] אז זה היה עושה קודם את האיברים ואז שורות
                // החיבור בין האותיות אומר שכל פעם שאחד מהם מתקדם אחד זה ישמור את זה בmatrix[i][j] אז אם נגיד התקדמתי מקום אחד בשורה הראשונה זה יהיה matrix[0][0] ואם התקדדמתי 2 זה יהיה matrix[0][1] ואם סיימתי שורה זה יראה matrix[1][0]
                matrix[i][j]=new Random().nextInt(100)+1;
                // מכניס לכל תא מספר אקראי מ1-100
            }

        }

        System.out.println(calculate(matrix));
        }
    public static int calculate(int[][] math) {// המתודה תחזיר מספר שלם כי כתוב INT אבל המתודה תיקח רק מערכים דו ממדיים בגלל שכתוב INT [][] והשם של המערך הוא MATH
        int sum = 0;// משתנה לסכום
        for (int i = 0; i < math.length; i++) {// זה כמו למעלה אבל הפעם מה שקורה זה שהמתודה CLACULATE לוקחת מערך שהשתמשתי עליו במתודה הזאת (INT[3][3]) ומשתמשת בו אז במקרה הזה הלולאה תרוץ שלוש פעמים כי יש שלוש שורות במערך
            for (int j = 0; j < math[i].length; j++) {//כמו השורה למעלה אבל זה עובר על המקומות בתוך כל שורה במערך
                sum += math[i][j];// מוסיף את מספר השורות ועוד מספר המקומות שעברו ומחבר אותם
            }
        }
        return sum;
    }


    }


