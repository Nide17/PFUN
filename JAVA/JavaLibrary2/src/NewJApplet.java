

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class NewJApplet extends JApplet {

    public static void main(String arg[]) {
        JFrame f = new JFrame(" swing");
        JLabel L1=new JLabel("you name");
        JTextField t1= new JTextField(10);
        JButton b=new JButton("reset");
        
        b.addActionListener(l);
        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu();
        JMenu edit = new JMenu();
        JMenuItem fitem1=new JMenuItem("new");
        JMenuItem fitem2=new JMenuItem("close");
        JMenuItem fitem3=new JMenuItem("copy");
        JMenuItem fitem4=new JMenuItem("paste");
        
        file.add(fitem1);
        file.add(fitem1);
        file.add(fitem1);
        file.add(fitem1);
        
        f.add(L1);
       f.add(t1);
        f.add(t1);
         f.add(b);
      
       
       f.setLayout(new FlowLayout());
       f.setVisible(true);
       f.setSize(200, 250);
    }

    
}
