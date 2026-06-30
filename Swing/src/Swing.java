import javax.swing.*;
import javax.swing.SwingUtilities;

public class Swing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            //   המילים SwingUtilities הן כמו מתווך הן בעצם פונות אל התוכנה ואומרות לה תתני לי להביא את המשימה של ייצור החלק הגרפי לעובד שמתאים לזה
            // המילים INVOKELATER הן אומרות תעביר את הפעולות לעובד הגרפי שיריץ אבל רק כשהוא יהיה פנוי(כשהתוכנה תרוץ)
            // לגבי NewRunnable אז המילה RUNNABLE היא בעצם כמו פתק שכתוב עליו הוראות ולדוגמא השיטה RUN פה היא ההוראה שמופיעה על הפתק אז בעצם RUNNABLE מביא הוראות לעובד הגרפי
            @Override
            public void run(){
                MainWindow main = new MainWindow();
                main.show();

            }
        });
    }
}