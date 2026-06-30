public class Main {
    public static void main(String[] args) {
        /*int[] arr = new int[3];
        arr[0] = 9;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(countPrimes(arr));

        Employee[] e1 = new Employee[2];
        e1[0]=new FullTimeEmployee();
        e1[1]=new PartTimeEmployee();
        for (Employee e2:e1){
            System.out.println(e2.calculateSalary());
        }
        Loggable[] log1 = new Loggable[2];
        log1[0]=new User();
        log1[1]=new Product();
        for (Loggable log2:log1){
            log2.logInfo();}
*/
            int[] arr2 = new int[5];
            arr2[0]=1;
            arr2[1]=2;
            arr2[2]=3;
            arr2[3]=2;
            arr2[4]=1;
           System.out.println(isPalindrome(arr2));
        /*int[] hugePalindrome = new int[100];
        int i = 0;
        while (i < 50) {
            hugePalindrome[i] = i + 1;
            hugePalindrome[99 - i] = i + 1;
            i++;
        }
        System.out.println(isPalindrome(hugePalindrome));
        int[] arr3={2,2,2,7,4,4};
        System.out.println(countIdenticalPairs(arr3));*/
        }
    public static int countPrimes(int[] arr) {
        int counter = 0;
        int i = 0;
        while (i < arr.length) {
            int num = arr[i];
            if (num > 1) {
                if (num == 2 || num == 3) {
                    counter++;
                } else {
                    int j = 2;
                    while (j < num) {
                        if (num % j == 0) {
                            num = 0;
                            break;
                        }
                        j++;
                    }
                    if (num != 0) {
                        counter++;
                    }
                }
            }
            i++;
        }
        return counter;
    }
    public static boolean isPalindrome(int[] arr){
        int length=arr.length;
        int front=0;
        int back=length-1;
        boolean b = true;
        while (front!=back){
            front++;
            back--;
            if (arr[front] != arr[back]){
                b = false;
                break;
            }
        }
        return b;
    }
        public static int countIdenticalPairs(int[]arr){
        int nearPairs=0;
            // length=6
            //array length=5
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]==arr[i+1]){
                nearPairs++;
            }
        }
        return nearPairs;
        }
}


