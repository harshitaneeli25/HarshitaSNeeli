
//5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
//the concerned color whenever the specific tab is selected in the Pan.

package five;

import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Color Tabs");

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with colors
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add to frame
        frame.add(tabbedPane);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
