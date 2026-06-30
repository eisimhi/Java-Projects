
public class Main {
    public static void main(String[] args) {
        calculateSum();
        calculateAverage();
        calculateArea();
        calculateTax();
        calculateAverage2();
        calculateAverage3();
        calculateArray();
        calculateArray2();

    }

    private static void calculateArray2() {
        int[] numbers = {4,7,88,21};
        int sum = numbers[0]*numbers[1]*numbers[2]*numbers[3];
        System.out.println("המכפלה היא: "+sum);
    }

    private static void calculateArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]+numbers[5];
        System.out.println("הסכום הוא: "+sum);
    }

    private static void calculateAverage3() {
        byte grade1 = 70;
        byte grade2 = 80;
        byte grade3 = 90;
        byte grade4 = 100;
        float weight1 = 0.1F;
        float weight2 = 0.2F;
        float weight3 = 0.3F;
        float weight4 = 0.4F;
        double total = grade1*weight1+grade2*weight2+grade3*weight3+grade4*weight4;
        System.out.println("הממוצע הוא: "+ total);
    }

    private static void calculateAverage2() {
        byte grade1 = 85;
        byte grade2 = 90;
        byte grade3 = 100;
        float weight1 = 0.2F;
        float weight2 = 0.3F;
        float weight3 = 0.5F;
        double average = grade1* weight1+grade2*weight2+grade3*weight3;
        System.out.println("הממוצע המשוקלל הוא: "+ average);

    }

    private static void calculateTax() {
        byte item1 = 25;
        byte item2 = 40;
        byte item3 = 35;
        float taxRate = 0.17F;
        int total = item1+item2+item3; //סכום לפני מס
        double tax =  (total*taxRate);//חישוב גובה המס
        double finalPrice = total+tax;//סכום אחרי הוספת המס
        System.out.println("הסכום לפני המס: "+ total);
        System.out.println("המס: "+tax);
        System.out.println(" סכום אחרי הוספת מס: "+ finalPrice);
    }

    public static void calculateArea() {
        int width = 4;
        int height = 7;
        int area = height*width;
        System.out.println(" השטח של המלבן הוא:"+ area);
    }

    public static void calculateSum() {
        int number = 3;
        int number2 = 5;
        int sum = number + number2;
        System.out.println("הסכום הוא: " + sum);
    }

    public static void calculateAverage() {
        int num1 = 4;
        int num2 = 7;
        int num3 = 10;
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("הממוצע הוא: " + average);
    }


}
