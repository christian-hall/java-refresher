
public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator!");
		System.out.println();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int fact = Console.getInt("Enter a positive number: ", 0, (int) Double.POSITIVE_INFINITY);
			int id = fact;
			int idx = 1;
			;
			while (fact > 0) {
				idx *= fact;
				fact--;
			}
			if (idx != 0) {
				System.out.println("The factorial of " + id + " equals " + idx);
			} else {
				System.out.println("The factorial could not be calculated");
			}
			System.out.println();
			choice = Console.getString("Again? (y/n): ", "y", "n");
			System.out.println();
		}
		System.out.println("Goodbye");
	}

}
