package ishimwe;

import java.io.*;

public class Ishimwe {

   static int a,b,c;
    public static void main(String[] args)throws IOException {
        String s1,s2;
        DataInputStream m= new DataInputStream(System.in);
        System.out.println("enter a:");
        s1=m.readLine( );
          System.out.println("enter b:");
        s2=m.readLine( );
     
      a=Integer.parseInt(s1);  
      b=Integer.parseInt(s2);
      c=a+b;
        System.out.print("Parmenide, ");
        System.out.println("The value of c is "+c+"!");
     
    }
    
}
