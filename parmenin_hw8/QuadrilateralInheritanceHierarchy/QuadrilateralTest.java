// Question 9.8 (Quadrilateral Inheritance Hierarchy) 

public class QuadrilateralTest {

    public static void main(String[] args) {
        Quadrilateral quad = new Quadrilateral(2.3, 2.4, 7.8, 4.0, 7.3, 11.1, 3.4, 8.6);
        Rectangle rect = new Rectangle(0.0, 2.0, 6.0, 2.0, 6.0, 6.0, 0.0, 6.0);
        Square squ = new Square(0.0, 2.0, 6.0, 2.0, 6.0, 8.0, 0.0, 8.0);
        Trapezoid trap = new Trapezoid(2.0, 2.0, 4.0, 6.0, 9.0, 6.0, 11.0, 2.0);
        Parallelogram paral = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);

        System.out.printf(String.format("%s", quad));
        System.out.printf(String.format("%n%s", rect));
        System.out.printf(String.format("%n%s", squ));
        System.out.printf(String.format("%n%s", trap));
        System.out.printf(String.format("%n%s", paral));
    }
}
