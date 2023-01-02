// Question 9.8 (Quadrilateral Inheritance Hierarchy) 

public class Parallelogram extends Trapezoid {

    public Parallelogram() {
    }

    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    // Area = b * h will be equal to that of trapezoid ((a + b) / 2) * h since a = b (two sides are equal)
    // toString() method
    @Override
    public String toString() {
        return String.format(" %n %s:  %s %n %s:  %s %n %s:  %s %n", "The parallelogram: ",
                getAllPoints(), "The parallelogram's height is", getLength(), "The parallelogram's area is", getArea());
    }
}
