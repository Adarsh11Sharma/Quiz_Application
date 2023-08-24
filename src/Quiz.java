import javax.swing.*;
import java.awt.*;

public class Quiz extends JFrame {
    Quiz() {
        setSize(800, 400); // Adjusted size
        setLocation(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Set the layout and background color
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 800, 150); // Adjusted size
        add(image);
    }

    public static void main(String[] args) {
        new Quiz();
    }
}

