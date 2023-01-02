// Question 5.11
// HABIMANA Jean de Dieu
// ISHIMWE Niyomwungeri Parmenide

public class TrianglePrinting {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("(a)");
		for (int i =0; i < 10; i++)
		{
		    for (int j=0; j < i+1; j++)
		    {
		       System.out.print("*");
		    }
		    
		    System.out.println();

		}
		System.out.println();
		System.out.println("(b)");
		for (int i =10; i > 0; i--)
		{
		    for (int j=0; j < i-1; j++)
		    {
		       System.out.print("*");
		    }
		    
		    System.out.println();

		}

		System.out.println("(c)");
		for (int i =0; i < 10; i++)
		{
		    for (int j=1; j < i+1; j++)
		    {
		       System.out.print(" ");
		    }
		       for(int y=10; y > i; y--)
		       {  
		    	   System.out.print("*");
		       }
	    	   System.out.println();
		    }

		System.out.println();
		System.out.println("(d)");
		for(int i = 10; i > 0; i--)
		{
		
			for(int x=0; x < i-1; x++)
			{
				System.out.print(" ");
			}
				for(int z=10; z > i-1; z--)
				{
					System.out.print("*");
				}
				System.out.println();
			}	
	
	
	}

}
