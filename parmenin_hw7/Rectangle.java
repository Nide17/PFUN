// Question 8.5

public class Rectangle {

    private float length = 1;
    private float width = 1;

    // CONSTRUCTORS
    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // GETTERS AND SETTERS
    public void setLength(float length) {
        if (length > 0.0 && length < 20) {
            this.length = length;
        }

        else {
            System.out.println("Length is incorrect; enter length > 0 and < 20!");
        }
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        if (width > 0.0 && width < 20) {
            this.width = width;
        }

        else {
            System.out.println("Width is incorrect; enter width > 0 and < 20!");
        }
    }

    public float getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle's length=" + length + ", width=" + width;
    }

    public float calculatePerimeter() {
        return (getLength() + getWidth()) * 2;
    }

    public float calculateArea() {
        return getLength() * getWidth();
    }

}
