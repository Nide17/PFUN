
// Question 8.1 - GUI and Graphics Case Study Exercise 9.1
import java.awt.Color;
import java.awt.Graphics;

public class MyOval {

    // Instance variables: coordinates, color
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color myColor;
    private boolean fill;

    // Constructors
    public MyOval() {
        // sets the shape’s coordinates to 0, the color of the shape to Color.BLACK, and
        // the filled property to false
        this(0, 0, 0, 0, Color.BLACK, false);
    }

    public MyOval(int x1, int y1, int x2, int y2, Color color, boolean isFill) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setColor(color);
        setFill(isFill);
    }

    // Getters and setters
    public void setX1(int x1) {
        this.x1 = (x1 >= 0 ? x1 : 0);
    }

    public int getX1() {
        return x1;
    }

    public void setX2(int x2) {
        this.x2 = (x2 >= 0 ? x2 : 0);
    }

    public int getX2() {
        return x2;
    }

    public void setY1(int y1) {
        this.y1 = (y1 >= 0 ? y1 : 0);
    }

    public int getY1() {
        return y1;
    }

    public void setY2(int y2) {
        this.y2 = (y2 >= 0 ? y2 : 0);
    }

    public int getY2() {
        return y2;
    }

    public void setColor(Color color) {
        myColor = color;
    }

    public Color getColor() {

        return myColor;
    }

    // Methods for oval
    public int getUpperLeftX() {
        return Math.min(getX1(), getX2());
    }

    public int getUpperLeftY() {
        return Math.min(getY1(), getY2());
    }

    public int getWidth() {
        return Math.abs(getX2() - getX1());
    }

    public int getHeight() {
        return Math.abs(getY2() - getY1());
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean isFill) {
        fill = isFill;
    }

    public void draw(Graphics g) {
        g.setColor(getColor());

        if (isFill())
            g.fillOval(getUpperLeftX(), getUpperLeftY(),
                    getWidth(), getHeight());
        else
            g.drawOval(getUpperLeftX(), getUpperLeftY(),
                    getWidth(), getHeight());
    }

    // toString() method
    @Override
    public String toString() {
        return "{" + " x1='" + getX1() + "'" + ", y1='" + getY1() + "'" + ", x2='" + getX2() + "'" + ", y2='" + getY2()
                + "'" + ", myColor='" + getColor() + "'" + ", filled='" + isFill() + "'" + "}";
    }
}