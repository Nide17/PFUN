
// Question 8.1 - GUI and Graphics Case Study Exercise 9.1
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

public class TestDraw {
    public static void main(String args[]) {

        // Instantinating the frame and panel
        DrawPanel panel = new DrawPanel();
        JFrame frame = new JFrame();

        // Creating a JLabel
        JLabel stLabel = new JLabel(panel.getStaText());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        // Attach the JLabel to the SOUTH region of the JFrame
        frame.add(stLabel, BorderLayout.SOUTH);
        stLabel.setBackground(Color.LIGHT_GRAY);
        stLabel.setOpaque(true);

        frame.setSize(348, 340);
        frame.setVisible(true);
    }
}
