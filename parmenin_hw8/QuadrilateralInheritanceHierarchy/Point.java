// Question 9.8 (Quadrilateral Inheritance Hierarchy) 

public class Point {

    // Instance variables
    private double x;
    private double y;

    // Constructors
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // To string method
    @Override
    public String toString() {
        return "{" +
                " x='" + getX() + "'" +
                ", y='" + getY() + "'" +
                "}";
    }

}
