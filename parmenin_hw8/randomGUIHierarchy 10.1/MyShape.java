import java.awt.*;

// GUI and Graphics Case Study Exercise 10.1
public abstract class MyShape {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;

    // flag that determines whether to draw the shape
    private boolean filled;

    // Constructors
    public MyShape() {
        this(0, 0, 0, 0, Color.BLACK);
    }

    public MyShape(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    // Getters and setters
    public int getX1() {
        return this.x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return this.y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return this.x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return this.y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Methods
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

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean isFilled) {
        filled = isFilled;
    }

    // toString() method
    @Override
    public String toString() {
        return "{" +
                " x1='" + getX1() + "'" +
                ", y1='" + getY1() + "'" +
                ", x2='" + getX2() + "'" +
                ", y2='" + getY2() + "'" +
                ", color='" + getColor() + "'" +
                "}";
    }

    // draw abstract method
    public abstract void draw(Graphics g);
}
