//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed”
//depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling
//mechanism with addActionListener( ).



package fourth;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEventDemo {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Button Event Handling");

        // Create components
        JLabel label = new JLabel("Press a button");
        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Add ActionListener to India button
        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        // Add ActionListener to Srilanka button
        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(btnIndia);
        frame.add(btnSrilanka);

        // Frame settings
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
