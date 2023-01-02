
// Question 8.1 - GUI and Graphics Case Study Exercise 9.1
import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle {

  // coordinates
  private int x1;
  private int y1;
  private int x2;
  private int y2;

  // Font color and fill of the rectangle
  private Color myColor;
  private boolean fill;

  // Constructors
  public MyRectangle() {
    // set the shape’s coordinates to 0, the color of the shape to Color.BLACK, and
    // the filled property to false
    this(0, 0, 0, 0, Color.BLACK, false);
  }

  public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean isFill) {
    setX1(x1);
    setY1(y1);
    setX2(x2);
    setY2(y2);
    setColor(color);
    setFill(isFill);
  }

  // Getters and setters
  public void setX1(int x1) {
    // verify that the argument is greater than or equal to zero before setting the
    // coordinate
    this.x1 = (x1 >= 0 ? x1 : 0);
  }

  public int getX1() {
    return x1;
  }

  public void setX2(int x2) {
    // verify that the argument is greater than or equal to zero before setting the
    // coordinate
    this.x2 = (x2 >= 0 ? x2 : 0);
  }

  public int getX2() {
    return x2;
  }

  public void setY1(int y1) {
    // verify that the argument is greater than or equal to zero before setting the
    // coordinate
    this.y1 = (y1 >= 0 ? y1 : 0);
  }

  public int getY1() {
    return y1;
  }

  public void setY2(int y2) {
    // verify that the argument is greater than or equal to zero before setting the
    // coordinate
    this.y2 = (y2 >= 0 ? y2 : 0);
  }

  public int getY2() {
    return y2;
  }

  public void setColor(Color color) {
    myColor = color;
  }

  public Color getColor() {
    return myColor;
  }

  // Methods
  // The upper-left x-coordinate is the smaller of the two x-coordinate values
  public int getUpperLeftX() {
    return Math.min(getX1(), getX2());
  }

  // the upper-left y-coordinate is the smaller of the two y-coordinate values
  public int getUpperLeftY() {
    return Math.min(getY1(), getY2());
  }

  // the width is the absolute value of the difference between the two
  // x-coordinate values
  public int getWidth() {
    return Math.abs(getX2() - getX1());
  }

  // the height is the absolute value of the difference between the two
  // y-coordinate values
  public int getHeight() {
    return Math.abs(getY2() - getY1());
  }

  public boolean isFill() {
    return fill;
  }

  public void setFill(boolean isFill) {
    fill = isFill;
  }

  // reference the coordinates by the get methods rather than access them directly.
  public void draw(Graphics g) {
    g.setColor(getColor());

    if (isFill()) {
      g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    }

    else {
      g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    }
  }

  // toString() method
  @Override
  public String toString() {
    return "{" + " x1='" + getX1() + "'" + ", y1='" + getY1() + "'" + ", x2='" + getX2() + "'" + ", y2='" + getY2()
        + "'" + ", myColor='" + getColor() + "'" + ", filled='" + isFill() + "'" + "}";
  }
}
