import java.awt.*;

// GUI and Graphics Case Study Exercise 10.1
public class MyLine extends MyShape {

  // Constructors
  public MyLine() {
    super();
  }

  public MyLine(int x1, int y1, int x2, int y2, Color color) {
    super(x1, y1, x2, y2, color);
  }

  // Implementation of the draw method
  public void draw(Graphics g) {
    g.setColor(super.getColor());
    g.drawLine(super.getX1(), super.getY1(), super.getX2(), super.getY2());
  }

}
