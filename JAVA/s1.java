import java.io.IOException;

import java.io.*;

interface  Datafe{

		public void getData() throws IOException;

		public void Result() throws IOException;
		
}
class Inherde implements Dataf {
	
	DataInputStream ob = new DataInputStream(System.in);
	float n0, n1;
	public  String num1;
	public   String num2;
	
	public void getData() throws IOException {
		
 		System.out.print("Enter number 1: ");
		num1 = ob.readLine();
		 n0 = Float.parseFloat(num1);

		 System.out.print("Enter number 2: ");
			num2 = ob.readLine();
		 n1 = Float.parseFloat(num2);

  	}
	public void Result() throws IOException{
		getData();
		float prod;
		prod = n0*n1;

	System.out.println(n0+"*"+n1+"="+prod);
		

	}

}



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		Inherde data = new Inherde();
		
		data.Result();


	}

}

