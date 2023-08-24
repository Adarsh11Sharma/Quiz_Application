import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton back, start;

    Rules(String name) {
        this.name = name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel Heading = new JLabel("Welcome " + name + " to Simple Minds ");
        Heading.setBounds(50, 20, 700, 30);
        add(Heading);
        Heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
        Heading.setForeground(Color.BLUE);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        add(rules);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(Color.BLUE);
        rules.setText( "<html>"+
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                "<html>");

        start = new JButton("Start");
        start.setBounds(100, 500, 120, 30);
        start.setBackground(new Color(30, 144, 254));
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(600, 500, 120, 30);
        back.setBackground(new Color(30, 144, 254));
        back.addActionListener(this);
        add(back);

        setSize(800, 650);
        setLocation(300, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
           new Quiz();
            // Handle "Start" button click
            // For example, you might want to open a new question screen or quiz.
        } else if (ae.getSource() == back) {
            // Handle "Back" button click
            setVisible(false);
            new Login(); // Go back to the login screen
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
