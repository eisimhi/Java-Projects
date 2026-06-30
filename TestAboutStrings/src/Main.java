public class Main {
    public static void main(String[] args) {
        String greeting = "Good morning";
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());
        String name = "  Evyatar ";
        System.out.println(name.trim().toUpperCase());
        System.out.println(name.startsWith("Evy"));
        System.out.println(name.endsWith("tar"));
        String quote = "i am \"learning\" java";
        System.out.println(quote);
        String path = "C:\\Program Files\\Java";
        System.out.println(path);
        String text = "I like cats";
        System.out.println(text.replace("cats","dogs"));

        String sentence = "Java is fun and powerful";
        System.out.println(sentence.charAt(0));//כותבים charAT אם רוצים לבחור אות מתוך משפט ולהדפיס אותה
        System.out.println(sentence.charAt(sentence.length()-1));//בהתחלה כותבים charAT כדי לבחור אות ואז כותבים LENGTH כדי לדעת כמה אותיות יש במשפט -1 ובגלל שיש 24 אותיות זה ידפיס את האות שהיא מספר 23 שהיא האות האחרונה כי בJAVA מתחילים את הספירה ב0
        String text2 = " Java Programming ";
        System.out.println(text2.trim().toUpperCase());
        System.out.println(text2.trim().toLowerCase());
        String pharse = "I Love Java";
        System.out.println(pharse.contains("Java"));
        System.out.println(pharse.replace("Java","Python"));
        String quote2 = "She said, \"Java is awesome\"";
        System.out.println(quote2);
        String filePath = "D:\\Documents\\Files\\Java";
        System.out.println(filePath);
        String info = "Name: Evyatar, Age: 15";
        int start = info.indexOf("Evyatar");
        System.out.println(start);
        String name1 = info.substring(start, start + 7);// המשפט הזה אומר לתוכנה תקחי את המילה שמתחילה באות השישית(E) ואז בגלל שהשם הוא באורך של 7 אותיות אז אני אומר לתוכנה תפסיקי לקחת את השם אחרי 7 אותיות ואז זה לוקח את השם
        System.out.println(name1);
        String info1 = "City: Tel Aviv, Country: Israel";
        int start1 = info1.indexOf("Tel");
        System.out.println(start1);
        String name2 = info1.substring(start1,start1 +8);
        System.out.println(name2);
        String csv = "apple,banana,orange";
        String[] parts = csv.split(",");// עם SPLIT אפשר לחלק מחרוזות לחלקים
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);



    }
}
