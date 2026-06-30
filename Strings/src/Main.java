
public class Main {
    public static void main (String[] args) {
        String message3 = "C:\\windows";// הסימן \ הוא סימן מיוחד שיש לו פעולות משלו אז לדוגמא במשפט הזה הסיבה שיש \ פעמיים זה כדי להגיד לתוכנה אני רוצה לכתוב \ כי אם אני אכתוב \ רק פעם אחת אז התוכנה במקרה הזה תחשוב שאני רוצה לכתוב\w שאין פעולה כזאת ולכן כותבים\\
        String message2 = "hi \"evyatar\"";  //אם רוצים להוסיף מרכאות בתוך מרכאות צריך לשים \ לפני המרכאות הראשון ובסיום המילה
        String message = "   hello" + " my name is evyatar ";// משתנה STRING  הוא משתנה שלא ניתן לשינוי כמו משתנה פרימיטיבי למרות שSTRING הוא רפרנסי
        System.out.println((message.length()));// סופר כמה CHARACTER יש במשפט וזה כולל רווחים
        System.out.println((message.toUpperCase()));// הופך את כל האותיות במשפט לאותיות גדולות
        System.out.println((message.trim().toUpperCase()));// trim=מוריד רווחים מיותרים מתחילת המשפט
        System.out.println((message.startsWith("   hello")));// זה כולל את הרווחים, אם לא יהיה את אותו מספר רווחים זה יהיה FALSE אבל בגלל שיש גם את אותו מספר רווחים וגם את אותה המילה אז זה TRUE
        System.out.println((message.endsWith("evyatar ")));// אותו דבר כמו למעלה אבל הפעם באיזה מילה זה מסתיים
        System.out.println(message.replace("hello", "hi"));//מחליף את המילה המקורית המילה השנייה שכתבתי
        System.out.println(message2);
        System.out.println(message3);

    }
}