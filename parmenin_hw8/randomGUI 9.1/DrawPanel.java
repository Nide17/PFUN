
// Question 8.1 - GUI and Graphics Case Study Exercise 9.1
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private SecureRandom rand = new SecureRandom();

    private String staText;

    // handle the creation of the shapes, should declare three arrays, one for each shape type
    private MyLine lines[];
    private MyRectangle rects[];
    private MyOval ovals[];

    // Constructors - fill each array with shapes of random position, size, color and fill.
    public DrawPanel() {

        // The length of each array should be a random number between 1 and 5
        lines = new MyLine[1 + rand.nextInt(5)];
        ovals = new MyOval[1 + rand.nextInt(5)];
        rects = new MyRectangle[1 + rand.nextInt(5)];
        

        // LINE
        for (int count = 0; count < lines.length; count++) {
            // Generating random coordinates
            int x1 = rand.nextInt(300);
            int y1 = rand.nextInt(300);
            int x2 = rand.nextInt(300);
            int y2 = rand.nextInt(300);

            // Generating random color for the lines
            Color color = new Color(rand.nextInt(192),
                    rand.nextInt(192), rand.nextInt(192));

            // Adding and counting lines
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }

        // RECTANGLE
        for (int count = 0; count < rects.length; count++) {

            // Generating random coordinates
            int x1 = rand.nextInt(300);
            int y1 = rand.nextInt(300);
            int x2 = rand.nextInt(300);
            int y2 = rand.nextInt(300);

            // Generating random color for the rectangles
            Color color = new Color(rand.nextInt(192),
                    rand.nextInt(192), rand.nextInt(192));

            // Defining the filling
            boolean fill = rand.nextBoolean();

            // Adding rectangles
            rects[count] = new MyRectangle(x1, y1, x2, y2, color, fill);

            // The status bar
            staText = String.format(" %s: %d, %s: %d, %s: %d", "Lines", lines.length, "Ovals", ovals.length,
                    "Rectangles", rects.length);
        }

        // OVAL
        for (int count = 0; count < ovals.length; count++) {

            // Generating random coordinates
            int x1 = rand.nextInt(300);
            int y1 = rand.nextInt(300);
            int x2 = rand.nextInt(300);
            int y2 = rand.nextInt(300);

            // Generating random color for the oval
            Color color = new Color(rand.nextInt(192),
                    rand.nextInt(192), rand.nextInt(192));

            // Defining the filling
            boolean fill = rand.nextBoolean();

            // Adding ovals
            ovals[count] = new MyOval(x1, y1, x2, y2, color, fill);
        }
    }

    // Getters and setters
    // method that returns a String containing the status text
    public String getStaText() {
        return this.staText;
    }

    public void setStaText(String staText) {
        this.staText = staText;
    }

    // Methods
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Drawing lines
        for (MyLine line : lines) {
            line.draw(g);
        }

        // Drawing rectangles
        for (MyRectangle rectangle : rects) {
            rectangle.draw(g);
        }

        // Drawing ovals
        for (MyOval oval : ovals) {
            oval.draw(g);
        }
    }

    // toString() method
    @Override
    public String toString() {
        return "{" + "staText='" + getStaText() + "'" + "}";
    }

}