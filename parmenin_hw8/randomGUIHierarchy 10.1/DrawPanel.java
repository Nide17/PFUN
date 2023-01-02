import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

// GUI and Graphics Case Study Exercise 10.1
public class DrawPanel extends JPanel {

    private SecureRandom rand = new SecureRandom();
    MyShape[] shapesArr;

    private int shapeType; // 0 - Line, 1 - Oval, 2 - Rectangle
    private Color CurrentColor;
    private boolean filledShape;
    private String sText;

    int linesCount = 0, ovalsCount = 0, rectanglesCount = 0;
    int nbrOfShapes; // Count of shapes

    // Constructor
    public DrawPanel() {
    }

    public DrawPanel(int nbrOfShapes) {

        shapesArr = new MyShape[nbrOfShapes];

        setShapeType(0);
        setCurrentColor(Color.BLACK);
        setFilledShape(false);

        // GENERATING SHAPES
        for (int i = 0; i < nbrOfShapes; i++) {

            setShapeType(rand.nextInt(3));

            // Generating random coordinates
            int x1 = rand.nextInt(300);
            int y1 = rand.nextInt(300);
            int x2 = rand.nextInt(300);
            int y2 = rand.nextInt(300);

            // Generating random color for the lines
            setCurrentColor(new Color(rand.nextInt(192), rand.nextInt(192), rand.nextInt(192)));

            setFilledShape(rand.nextBoolean());

            // GENERATING AND COUNTING SHAPES
            if (shapeType == 0) {
                shapesArr[i] = new MyLine(x1, y1, x2, y2, CurrentColor);
                linesCount++;
            } else if (shapeType == 1) {
                shapesArr[i] = new MyOval(x1, y1, x2, y2, CurrentColor, filledShape);
                ovalsCount++;
            } else {
                shapesArr[i] = new MyRectangle(x1, y1, x2, y2, CurrentColor, filledShape);
                rectanglesCount++;
            }

            // The status bar
            setSText(String.format(" %s: %d, %s: %d, %s: %d", "Lines",
                    linesCount, "Ovals",
                    ovalsCount,
                    "Rectangles", rectanglesCount));
        }
    }

    // Getters and setters
    public String getSText() {
        return this.sText;
    }

    public void setSText(String sText) {
        this.sText = sText;
    }

    public int getNbrOfShapes() {
        return this.nbrOfShapes;
    }

    public void setNbrOfShapes(int nbrOfShapes) {
        this.nbrOfShapes = nbrOfShapes;
    }

    public Color getCurrentColor(Color CurrentColor) {
        return this.CurrentColor;
    }

    public void setCurrentColor(Color CurrentColor) {
        this.CurrentColor = CurrentColor;
    }

    public boolean getFilledShape(boolean filledShape) {
        return this.filledShape;
    }

    public void setFilledShape(boolean filledShape) {
        this.filledShape = filledShape;
    }

    public int getShapeType(int shapeType) {
        return this.shapeType;
    }

    public void setShapeType(int shapeType) {
        this.shapeType = shapeType;
    }

    // the paintComponent to walk through the array and draw every shape
    // polymorphically.
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int shape = 0; shape < shapesArr.length; shape++) {
            shapesArr[shape].draw(g);
            System.out.println(shapesArr[shape]);
        }
    }

    // toString() method
    @Override
    public String toString() {
        return "{" + "staText='" + getSText() + "'" + "}";
    }
}