// Question 5.21
// HABIMANA Jean de Dieu
// ISHIMWE Niyomwungeri Parmenide

public class PythagoreanTriples {

	public static void main(String[] args) {
		System.out.println("Pythagorean Triples");
		System.out.println("===================");
		for (int side1 = 1; side1 < 500; side1++) {
			for (int side2 = 1; side2 < 500; side2++) {
				for (int hypotenuse = 1; hypotenuse < 500; hypotenuse++) {
					if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(hypotenuse, 2)) {
						System.out.println(+side1 + " + " + side2 + " = " + hypotenuse);

					} // End of if

				} // End of for3

			} // End of for2

		} // End of for1

	} // End of main

} // End of class PythagoreanTriples
