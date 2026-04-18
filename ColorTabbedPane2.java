package five;

import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("CMY Tabs");

        // TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("CYAN", cyanPanel);
        tabbedPane.addTab("MAGENTA", magentaPanel);
        tabbedPane.addTab("YELLOW", yellowPanel);

        frame.add(tabbedPane);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
