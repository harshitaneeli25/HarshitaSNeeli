//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
//is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
//implementing the event handling mechanism with addActionListener( ).


package fourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Image Button Event");

        // Create JLabel
        JLabel label = new JLabel("Press a button");

        // Load images (Make sure images are in same folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        JButton btnClock = new JButton("Digital Clock", clockIcon);
        JButton btnHourGlass = new JButton("Hour Glass", hourglassIcon);

        // Set layout
        frame.setLayout(new FlowLayout());

        // Event for Digital Clock button
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Event for Hour Glass button
        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components
        frame.add(label);
        frame.add(btnClock);
        frame.add(btnHourGlass);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
