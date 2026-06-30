import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> empIds = new HashMap<>();//פה בתוך <> חייבים לשים את הכיתות של המשתנים אי אפשר לשים int או long צריך לשים את הכיתה שלהם לדוגמא:INTEGER וLong
        // מפה בקיצור זה פשוט אוסף של אובייקטים והערך שלהם תלוי במה שמים בתוך ה<>
        empIds.put("Evyatar",12345);
        empIds.put("Carl",54321);
        empIds.put("Jerry",8675309);
        System.out.println(empIds.get("Evyatar"));
        System.out.println(empIds);
        System.out.println(empIds.containsKey("Jerry"));
        System.out.println(empIds.containsKey("hello"));
        System.out.println(empIds.containsValue(6));
        System.out.println(empIds.containsValue(54321));
        empIds.put("Evyatar",201020);
        System.out.println(empIds);
        empIds.replace("Carl",545454);
        System.out.println(empIds);
        empIds.putIfAbsent("Jerry",222222);//מעדכן רק אם אין את הערך כבר בתוך המפה ולכן במקרה הזה זה לא יעדכן כי יש כבר לג'רי ערך
        System.out.println(empIds);
        empIds.putIfAbsent("Steve",234567);
        System.out.println(empIds);
        empIds.remove("Steve");
        System.out.println(empIds);


        Map<String,Integer> fruits = new TreeMap<>();
        fruits.put("Apple",10);
        fruits.put("Banana",5);
        fruits.put("Apple",15);
        fruits.putIfAbsent("Banana",20);
        fruits.putIfAbsent("Orange",8);
        System.out.println(fruits);

            Map<Character,Integer> lettersInWord = new HashMap<>();
        String word = "banana";
        for (int i =0;i<word.length();i++){
            char currentLetter = word.charAt(i);
            if (lettersInWord.containsKey(currentLetter)){
                int count = lettersInWord.get(currentLetter);
                lettersInWord.put(currentLetter,count+1);
            }else {
                lettersInWord.put(currentLetter,1);
            }
        }
        System.out.println(lettersInWord);

        Map<String, Integer> dupesNames = new HashMap<>();
        String[] names = {"Yossi", "Dana", "Yossi", "Amit", "Dana", "Yossi"};
        for (int i = 0; i<names.length;i++){
            String currentName = names[i];
            if (dupesNames.containsKey(currentName)){
                int currentNumber=dupesNames.get(currentName);
                dupesNames.put(currentName,currentNumber+1);
            }else {
                dupesNames.put(currentName,1);
            }
        }
        System.out.println(dupesNames);
    }
}