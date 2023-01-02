 import javax.swing.*;
public class InterfaceImplement implements Exercise
{
int a,sq;
String s;
public void getNumber()
{
JOptionPane p=new JOptionPane();
s=p.showInputDialog("Enter a Number");
a=Integer.parseInt(s);
}
public void DisplaySquare()
{
if(a%2!=0)
{
sq=a*a;
System.out.println(sq);
}
else
{
System.out.println("Only Odd Numbers are used");
}
}

    @Override
    public void displaySquare() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class MainClass
{
public static void  main(String args[])
{
InterfaceImplement i=new InterfaceImplement();
i.getNumber();
i.displaySquare();
}
}