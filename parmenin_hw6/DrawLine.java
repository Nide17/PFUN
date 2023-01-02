// Question 7.1 a) GUI 
import java.awt.Color;
import java.awt.Graphics; 
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawLine extends JPanel
{
    private final static Color RED = Color.RED;
    
    public void paintComponent(Graphics g)
    {

        int centerX  = getWidth() / 2;
        int centerY = getHeight() / 2;

        g.setColor(RED);
        for (int i = 0; i < 3 ; i++)
        {
            g.drawLine(centerX  + (25 * i), centerY - (25 * i), centerX  + (25 * i), centerY + 25 + (25 * i));
            g.drawLine(centerX  + (25 * i), centerY + 25 + (25 * i), centerX  - 25 - (25 * i), centerY + 25 + (25 * i));
            g.drawLine(centerX  - 25 - (25 * i), centerY + 25 + (25 * i), centerX  - 25 - (25 * i), centerY - 25 - (25 * i));
            g.drawLine(centerX  - 25 - (25 * i), centerY - 25 - (25 * i), centerX  + 25 + (25 * i), centerY - 25 - (25 * i));
            g.drawLine(centerX  + (25 * i), centerY - (25 * i), centerX  + (25 * i), centerY + 25 + (25 * i));
        }
        g.drawLine(centerX  + (25 * 3), centerY - (25 * 3), centerX  + (25 * 3), centerY + 15 + (25 * 3));
    }
    

    public static void main(String[] args)
    {
        DrawLine panl = new DrawLine();
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        frame.setSize(210, 228); 
        frame.add(panl); 
        frame.setVisible(true); 
        
    }

}