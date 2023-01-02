
// Question 7.1 b) GUI 
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawArc extends JPanel {

    public void paintComponent(Graphics g) {

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int counter = 6;

        int arcWidth = 12;
        int growSize = 25;

        for (int i = 0; i < counter; i++) {

            // Upper circle
            g.drawArc(centerX - arcWidth + 12, centerY - arcWidth - 10, 2 * arcWidth, 2 * arcWidth, 0, 180);

            // Growing
            arcWidth += growSize;

            // Bottom circle
            g.drawArc(centerX - arcWidth + 12, centerY - arcWidth - 10, 2 * arcWidth - growSize, 2 * arcWidth, 180,
                    180);
        }
    }

    public static void main(String[] args) {
        DrawArc panel = new DrawArc();
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(200, 218);
        frame.setVisible(true);
    }
}