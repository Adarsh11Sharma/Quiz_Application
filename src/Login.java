
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules, back; // Declare class-level buttons
    JTextField tfname;

    Login() {
        // Setting up frame properties
        setSize(800, 400); // Adjusted size
        setLocation(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout and background color
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Creating and adding an image label
        ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 300, 400); // Adjusted size
        add(image);

        // Creating and adding a heading label
        JLabel Heading = new JLabel("Simple Minds");
        Heading.setBounds(350, 20, 300, 45); // Adjusted position
        add(Heading);
        Heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
        Heading.setForeground(Color.BLUE);

        tfname = new JTextField();
        tfname.setBounds(350, 100, 300, 25); // Adjusted position
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        // ... Other GUI components ...

        rules = new JButton("Rules"); // Use the class-level variable
        rules.setBounds(350, 160, 120, 30); // Adjusted position and size
        rules.setBackground(new Color(30, 144, 254));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back"); // Use the class-level variable
        back.setBounds(530, 160, 120, 30); // Adjusted position and size
        back.setBackground(new Color(30, 144, 254));
        back.addActionListener(this);
        add(back);

        // ... Other GUI components ...

        // Making the frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name); // Assuming you have a Rules class for the new screen
        } else if (ae.getSource() == back) {
            setVisible(false);
            // Handle back button action, e.g., going back to a previous screen
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login());
    }
}


