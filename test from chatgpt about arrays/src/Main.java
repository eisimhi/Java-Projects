import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {3,6,9};
        numbers[0]= 99;
        int [] values = new int[4];
        values[0]= 10;
        values[3]= 50;
        String[] words = {"Hello","World"};
        String[] copy = words;
        copy[1]= "Java";
        System.out.println(Arrays.toString(words));

        int[] nums = {4,8,12,16};
        int[] ref = nums;
        ref[2] = 99;
        System.out.println(Arrays.toString(nums));

        double[] data = new double[5];
        data[4]= 3.14;

        String[] names= {"Alice","Bob"};
        String[] second= new String[2];
        second[1]=names[1];
        System.out.println(Arrays.toString(second));

        int[] copyTest ={1,2,3};
        int[] otherCopy= copyTest;
        copyTest= new int[]{7, 8, 9};
        System.out.println(otherCopy[0]);

        int[] ages= {18,25,30};
        System.out.println(Arrays.toString(ages));

        String[] colors= {"Red","Blue"};
        colors[0]= "Green";
        System.out.println(Arrays.toString(colors));

        double[] prices = {2.5,4.5,6.5};
        double[] backup = prices;
        backup[1]= 99.99;
        System.out.println(Arrays.toString(prices));

        int[] firstArray= {7,14,21};
        int[] secondArray= firstArray;
        firstArray= new int[]{100,200,300};
        System.out.println(secondArray[1]);
    }
}
