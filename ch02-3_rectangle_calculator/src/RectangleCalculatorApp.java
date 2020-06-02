
public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Rectangle Calculator App!");
		System.out.println();
		String choice = "y";
		while (choice.equalsIgnoreCase("y") ) {
			double side1 = Console.getDouble("Enter first side: ", 0, Double.POSITIVE_INFINITY);
			double side2 = Console.getDouble("Enter second side: ", 0, Double.POSITIVE_INFINITY);
			System.out.println();
			System.out.println("Perimeter = " + ((side1 * 2) + (side2 * 2)));
			System.out.println("Area = " + (side1 * side2));
			System.out.println();
			choice = Console.getString("Another calculation? (y/n): ", "y", "n");
			System.out.println();
		}
		
		System.out.println("Goodbye");
	}

}
