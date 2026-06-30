import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Blackjack");
        JButton hitButton = new JButton("Hit");

        frame.setLayout(new FlowLayout()); // קובע איך הרכיבים יסודרו
        frame.add(hitButton); // מוסיף את הכפתור לחלון

        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}