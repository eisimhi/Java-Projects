
public class Recursion {// רקורסיה זה פשוט שיטה שעובדת בתוך עצמה, השיטה קוראת לעצמה
    public static void main(String[] args) {
       System.out.println(sum(3));
       System.out.println(power(2,3));
       System.out.println(fib(5));
       printReverse("hello");
       System.out.println();

    }
    public static int sum(int n){
        int sum1=0;
        if (n<=0) {
            return sum1;
        }
        sum1=sum(n-1)+n;
        return sum1;
    }
    public static int power(int base, int exponent){
        if (exponent==0){
            return 1;
        }
        int result=power(base,exponent-1)*base;
        return result;
    }
    public static long fib(int n){
        if (n==1){return 0;}
        else if (n==2){return 1;}
        return fib(n-1)+fib(n-2);
    }
    public static void printReverse(String str){
       if (str.length()==0){
           return;
       }
       printReverse(str.substring(1));
       System.out.print(str.charAt(0));
    }
}