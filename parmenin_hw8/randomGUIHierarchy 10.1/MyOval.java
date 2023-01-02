import java.awt.*;

// GUI and Graphics Case Study Exercise 10.1
public class MyOval extends MyShape {

    // Constructors
    public MyOval() {
        super();
        setFilled(false);
    }

    public MyOval(int x1, int y1, int x2, int y2, Color color, boolean isFilled) {
        super(x1, y1, x2, y2, color);
        setFilled(isFilled);
    }

    // Implementation of the draw method
    public void draw(Graphics g) {
        g.setColor(getColor());

        if (getFilled()) {
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        } else {
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        }
    }
}