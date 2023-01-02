import javax.swing.*;
import java.awt.*;

// GUI and Graphics Case Study Exercise 10.1
public class TestDraw {
    public static void main(String args[]) {

        JFrame frame = new JFrame();

        try {
            int nbrOfShapes = Integer.parseInt(JOptionPane.showInputDialog("How many shapes do you want to draw?"));

            // Instantinating the frame and panel
            DrawPanel panel = new DrawPanel(nbrOfShapes);

            // Creating a JLabel
            JLabel stLabel = new JLabel(panel.getSText());
            frame.add(panel);

            // Attach the JLabel to the SOUTH region of the JFrame
            frame.add(stLabel, BorderLayout.SOUTH);
            stLabel.setBackground(Color.LIGHT_GRAY);
            stLabel.setOpaque(true);

        } catch (Exception e) {

            // Exception if the input is not a number
            JLabel stLabel = new JLabel("Error: Invalid number!");
            stLabel.setHorizontalAlignment(0);
            stLabel.setForeground(Color.RED);
            frame.add(stLabel, BorderLayout.CENTER);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(348, 340);
        frame.setVisible(true);

    }
}
