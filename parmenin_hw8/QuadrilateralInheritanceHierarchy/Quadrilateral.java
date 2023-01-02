// Question 9.8 (Quadrilateral Inheritance Hierarchy) 

public class Quadrilateral {

    // Instance variables
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    // Constructors
    public Quadrilateral() {
    }

    // Constructing with Points
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    // Constructing with coordinate arguments
    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
        this.p3 = new Point(x3, y3);
        this.p4 = new Point(x4, y4);
    }

    // Getters and setters
    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return this.p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return this.p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    // To string method
    @Override
    public String toString() {
        return "\n The quadrilateral: {" +
                " p1='" + getP1() + "'" +
                ", p2='" + getP2() + "'" +
                ", p3='" + getP3() + "'" +
                ", p4='" + getP4() + "'" +
                "}";
    }

    // Returning all points as strings
    public String getAllPoints() {
        return String.format("%s, %s, %s, %s %n", getP1(), getP2(), getP3(), getP4());
    }
}