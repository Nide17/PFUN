// Question 9.8 (Quadrilateral Inheritance Hierarchy) 

public class Rectangle extends Quadrilateral {
    private double length; // the side of the Rectangle
    private double width; // the width of the rectangle

    // constructors
    public Rectangle() {
    }

    public Rectangle(double length) {
        this.length = length;
    }

    // Drawing the Rectangle with 4 points - 8 arguments
    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        // Using the parent
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    // Getters and setters
    public double getLength() {
        // Getting the length of a side
        if (getP1().getY() == getP2().getY())
            return Math.abs(getP2().getY() - getP3().getY());
        else
            return Math.abs(getP1().getY() - getP2().getY());
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        // Getting the width of a side
        if (getP1().getX() == getP2().getX())
            return Math.abs(getP2().getX() - getP3().getX());
        else
            return Math.abs(getP1().getX() - getP2().getX());
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Calculating the area = w * l
    public double getArea() {
        return getLength() * getWidth();
    }

    // toString() method
    @Override
    public String toString() {
        return String.format(" %n %s:  %s %s:  %s %n %s:  %s %n %s:  %s %n", "The rectangle",
                getAllPoints(), "The rectangle's length is", getLength(), "The rectangle's width is", getWidth(),
                "The rectangle's area is", getArea());
    }

}
