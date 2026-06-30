import javax.swing.*;
import java.awt.*;

public class MainWindow {
    private final JFrame window;

    public MainWindow(){
        window=new JFrame();
        window.setTitle("Hello World");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800,500);
        window.setLocationRelativeTo(null);// זה מחליט שהמסך יהיה באמצע ביחס למסך של המכשיר(NULL)
        JLabel label = new JLabel("hello world");
        window.setLayout(new FlowLayout());// זה אומר לחלון שנפתח תסדר לי את הרכיבים בשורה אחד אחרי השני ותמרכז אותם(רכיבים-טקסט,כפתור, שדה טקסט שהמשתמש יכול לכתוב בו, תיבת סימון)
        window.add(label);
        JButton button = new JButton("press me");
        window.add(button);
        JTextField field =new JTextField(20);//20 זה כמה תווים יראו בו זמנית המשתמש יכול לכתוב כמה שבא לו אבל רק 20 יראו
        window.add(field);
        button.addActionListener(e -> {
            String str = field.getText();// לוקח את מה שהמשתמש כתב ושומר אותו בתוך משתנה
            label.setText(str);// לוקח את הטקסט ששמרנו במשתנה ומציג אותו על המסך
        });   // המילים addActionListener אומרים: תבצע את הפעולה כשמישהו ילחץ על הכפתור
        // כשאתה לוחץ על הכפתור, ג'אווה מזהה את הלחיצה ויוצרת את e עם המידע עליה ההוראות שבתוך הסוגריים המסולסלים הן אלו שמבצעות את הפעולה, לא e עצמו
        ButtonGroup group = new ButtonGroup();//פה אני יוצר קבוצה של כפתורים והם פשוט יהיו חלק מהקבוצה הזאת
        JCheckBox checkBox = new JCheckBox("I Agree");
        window.add(checkBox);
        JCheckBox checkBox2 = new JCheckBox("I Disagree");
        window.add(checkBox2);
        group.add(checkBox);// פה אני מצרף את הכפתורים לקבוצה הזאת
        group.add(checkBox2);// מה שהקבוצה בעצם עושה היא אומרת לגאווה: הכפתורים האלה הם חברים באותה קבוצה אם אחד נבחר תבטל את השני, רק אחד יכול להיות מסומן
        checkBox.addActionListener(e -> {
            label.setText("you agree");
        });
        checkBox2.addActionListener(e ->{
             label.setText("you disagree");
        });



         }
    public void show(){
        window.setVisible(true);
    }
}
