import java.awt.*;

// GUI and Graphics Case Study Exercise 10.1
public class MyRectangle extends MyShape {

  // Constructors
  public MyRectangle() {
    super();
    setFilled(false);
  }

  public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean isFilled) {
    super(x1, y1, x2, y2, color);
    setFilled(isFilled);
  }

  // Implementation of the draw method
  public void draw(Graphics g) {
    g.setColor(getColor());

    if (getFilled()) {
      g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    }

    else {
      g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    }
  }
}
