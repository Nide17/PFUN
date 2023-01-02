 import javax.swing.*;
public class JavaApplication23 { 
    
    public static void PascalMadeOfStars(int n)
    { 
      int i,j,l;
      
      for(i=1;i<=n;i++)
      {
          for(l=1;l<i;l++)
                  System.out.print(" "+" ");
          for(j=i;j<=n;j++)
              System.out.print("*"+" ");
          
          System.out.println(" ");
      }
        
    }
    public static void DisplayMessage( int n1){
        int i;
        for(i=1;i<n1;i+=2)
            System.out.println(i+". Programming is a Paradize");
            
    }

    public static void main(String[] args) {
        
      JOptionPane n = new JOptionPane(System.in);
        String s1 = n.showInputDialog(null,"Enter a number less than 10: ");
        int num;
        
        num = Integer.parseInt(s1);
        if(num>5&&num<20)
        PascalMadeOfStars(num);
        else 
          DisplayMessage(num)  ;
       
        
    }
    
}