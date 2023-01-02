
// Question 12.9
import java.awt.*; // for using the colors and the layouts
import javax.swing.*; // for the swing components

public class GUI {
        public static void main(String[] args) {
                // Creating a new frame
                JFrame frame = new JFrame("Calculator");
                frame.setLayout(null); // We don't want any layout for the frame

                // Creating the buttons
                JButton button0 = new JButton("0");
                JButton button1 = new JButton("1");
                JButton button2 = new JButton("2");
                JButton button3 = new JButton("3");
                JButton button4 = new JButton("4");
                JButton button5 = new JButton("5");
                JButton button6 = new JButton("6");
                JButton button7 = new JButton("7");
                JButton button8 = new JButton("8");
                JButton button9 = new JButton("9");

                JButton buttonMult = new JButton("*");
                JButton buttonDiv = new JButton("/");
                JButton buttonPlus = new JButton("+");
                JButton buttonMinus = new JButton("-");
                JButton buttonEqual = new JButton("=");
                JButton buttonDot = new JButton(".");

                // CREATING A PANEL TO HOLD BUTTONS
                JPanel panel = new JPanel();

                // Adding buttons to the panle
                panel.add(button7);
                panel.add(button8);
                panel.add(button9);
                panel.add(buttonDiv);
                panel.add(button4);
                panel.add(button5);
                panel.add(button6);
                panel.add(buttonMult);
                panel.add(button1);
                panel.add(button2);
                panel.add(button3);
                panel.add(buttonMinus);
                panel.add(button0);
                panel.add(buttonDot);
                panel.add(buttonEqual);
                panel.add(buttonPlus);

                JTextField textField = new JTextField(); // Creating the textfield
                textField.setBounds(50, 10, 250, 40); // where it starts and end
                frame.add(textField); // Adding the text field to the frame

                panel.setBounds(50, 55, 250, 200); // where it starts and end
                panel.setBackground(Color.lightGray); // setting the panel's background color
                panel.setLayout(new GridLayout(4, 4, 7, 7)); // Grid layout for aligning the buttons in the panel

                frame.add(panel); // Adding the panel to the frane
                frame.setSize(400, 350); // setting the size of the frame
                frame.setVisible(true); // making it visible
        }

}
