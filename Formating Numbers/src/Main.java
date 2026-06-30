import java.text.NumberFormat;

public class Main {
    public static void main (String[] args){
        int num =42684268;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result2 = currency.format(num);
        System.out.println(result2);

        NumberFormat money = NumberFormat.getCurrencyInstance(); //פורמט מספר הוא כלי שמגדיר כיצג להציג מספרים בצורה שנוחה לקריאה לדוגמא: להפוך את 1000000 ל1,000,000 וGET CURRENCY INSTANCE גורם למספר המודפס להציג את הסכום במטבע:$, שקלים, יורו וכו'
        String result = money.format(1000000);//  FORMAT כותבים לפני המספר או המשתנה שאתה רוצה שיכתב עם הסימנים של הפסיקים והסוג כסף
        System.out.println(result);
        double num2 = 0.78;
        NumberFormat s = NumberFormat.getPercentInstance();// כותבים PRECENT אם רוצים לקבל את האחוזים
        String result3 = s.format(num2);
        System.out.println(result3);
    }
}