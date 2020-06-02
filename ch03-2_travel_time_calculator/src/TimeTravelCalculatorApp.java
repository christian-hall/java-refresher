
public class TimeTravelCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the time travel calculator app");
		System.out.println();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double distance = Console.getDouble("Enter miles driven: ", 0, Double.POSITIVE_INFINITY);
			double speed = Console.getDouble("Enter average speed (mph): ", 0, Double.POSITIVE_INFINITY);
			double time = (distance / speed) * 60;
			int hours = (int) Math.floor(time / 60);
			double minutes = time % 60;
			System.out.println("Your travel time will be: " + hours + " hours and " + (int)(minutes) + " minutes.");
			System.out.println();
			choice = Console.getString("Calculate again? (y/n): ", "y", "n");
			System.out.println();
		}
		System.out.println("Goodbye");
	}

}
