// Question 9.8 (Quadrilateral Inheritance Hierarchy) 

public class Square extends Rectangle {

    // Constructors
    public Square() {
    }

    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    // toString() method
    @Override
    public String toString() {
        return String.format(" %n %s:  %s %n %s:  %s %n %s:  %s %n", "The square: ",
                getAllPoints(), "The square's side is", getLength(), "The square's area is", getArea());
    }

}
