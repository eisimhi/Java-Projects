import java.util.Arrays;
import java.util.Scanner;
// לולאת FOR היא לולאה שמשתמשים בה רק אם יודעים כמה פעמים עומדים לחזור על הפעולה
/*public class For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade, sum=0;
        double avg;
        for(int i = 1;i<=10;i++){// יש לולאת FOR ואני מגדיר שם משתנה שקוראים לו I והלולאה הזאתי תמשיך לרוץ ככל שI קטן או שווה ל10 ובכל פעם שהלולאה רצה I יגדל באחד
            System.out.println("Enter the grade number "+i);
            grade= in.nextInt();
            System.out.println("Grade entered succssfully "+ grade);
            sum+=grade;// אם כותבים += או -= וכו' זה פשוט אומר לעשות חיבור או חיסור או פעולה אחרת עם המשתנה השני

        }
        avg = (double)sum/10;
        System.out.println("Your average is: "+ avg);
        in.close();
    }
}*/

/*class While{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int grade,sum=0, count=0;
        double avg;
        System.out.println("Enter the first grade");
        grade= input.nextInt();

        while(grade>0){// הסוגריים העגולים הם בעצם תנאי של הלולאה להמשיך לעבוד לדוגמא במקרה הזה אם יכתבו מספר שלילי הלולאה תפסיק לעבוד

            count++;
            sum+=grade;

            System.out.println("Enter grade number "+ (count+1));
            grade = input.nextInt();
        }
        if(count!=0){//אם המשתמש לא הכניס אף מספר, הקוד שבתוך ה־if לא ירוץ.
            avg=(double)sum/count;
        if(avg>=90.0){
            System.out.println("wow great job!!");
        }else if (avg>=75&&avg<90.0){
            System.out.println("Good job");
        }else{
            System.out.println("you could have done better");
        }
        System.out.println("Your average is "+ avg);
        }

    }
}*/




/*class testLoops{
    public static void main(String[]args){
        for(int i = 1;i<=10;i++){
        System.out.println(i);
        }
        int sum = 0;
        for (int i =1;i<=5;i++){
         sum+=i;
         System.out.println(sum);
        }
        int countEven=0,countOdd=0;
        int [] numbers ={3,6,7,10,15};
        for (int i =0;i<5;i++){
            if (numbers[i]%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Zugi= "+ countEven);
        System.out.println("Not Zugi= "+countOdd);
        int [] array = new int[5];
        for (int i = 0;i< array.length;i++){
            array[i]=i+1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}*/

class testLoop{
    public static void main (String[]args){
        for (int i = 1;i<6;i++){
            System.out.println(i);
        }
        int a =2;
        int b =3;
        int sum =a;
        for (int i = 0;i<b;i++){
            sum+=1;
            System.out.println(sum);
        }
        int[] arr = {4, 7, 1};
        for (int i = 0; i<arr.length;i++){
        System.out.println(arr[i]);
        }
        int [] ar = new int[3];
        for (int i = 0;i<ar.length;i++){
        ar[i]=i+1;

        }
        System.out.println(Arrays.toString(ar));
    }

}




