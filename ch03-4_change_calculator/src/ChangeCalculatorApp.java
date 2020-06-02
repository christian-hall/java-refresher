
public class ChangeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator App");
		System.out.println();
		String choice = "y";
		while (choice.equals("y")) {
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			int pennies = 0;
			int change = Console.getInt("Enter change amount, under $1.00: $0.", 0, 100);
			System.out.println();
			while (change > 0) {
				if ((change - 25) >= 0) {
					change -= 25;
					quarters++;
				} else if ((change - 10) >= 0) {
					change -= 10;
					dimes++;
				} else if ((change - 5 >= 0)) {
					change -= 5;
					nickels++;
				} else if ((change - 1) >= 0) {
					change -= 1;
					pennies++;
				}
			}
			System.out.println("Quarters: " + quarters);
			System.out.println("Dimes:    " + dimes);
			System.out.println("Nickels:  " + nickels);
			System.out.println("Pennies:  " + pennies);
			System.out.println();
			choice = Console.getString("Again? (y/n): ", "y", "n");
			System.out.println();
		}
		System.out.println("Goodbye");
	}

}
