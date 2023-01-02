// Question 9.8 (Quadrilateral Inheritance Hierarchy) 

public class Trapezoid extends Square {

    public Trapezoid() {
    }

    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    // Calculating the sum of width and height
    public double getTwoSideSum() {
        if (getP1().getY() == getP2().getY()) {
            return Math.abs(getP1().getX() - getP2().getX()) + Math.abs(getP3().getX() - getP4().getX());
        } else {
            return Math.abs(getP2().getX() - getP3().getX()) + Math.abs(getP4().getX() - getP1().getX());
        }
    }

    // The length
    public double getLength() {
        if (getP1().getY() == getP2().getY())
            return Math.abs(getP2().getY() - getP3().getY());
        else
            return Math.abs(getP1().getY() - getP2().getY());
    }

    public double getArea() {
        return (getTwoSideSum() / 2.0) * getLength(); // Area = ((a + b) / 2) * h
    }

    // toString() method
    @Override
    public String toString() {
        return String.format(" %n %s:  %s %n %s:  %s %n %s:  %s %n", "The trapezoid: ",
                getAllPoints(), "The trapezoid's height is", getLength(), "The trapezoid's area is", getArea());
    }

}
