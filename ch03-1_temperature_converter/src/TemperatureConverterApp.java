
public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the f/c temperature converter applicaiton");
		System.out.println();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double entry = Console.getDouble("Enter temperature: ");
			String unit = Console.getString("Enter this temperature's unit (f/c): ", "f", "c");
			if (unit.equalsIgnoreCase("f")) {
				double output = ((entry - 32) * 5 / 9);
				System.out.println(entry + " defrees F = " +  ((double) Math.round(output * 100)/100) + " degrees C");
				
			} else if (unit.equalsIgnoreCase("c")) {
				double output = (entry * 9 / 5 + 32);
				System.out.println(entry + " defrees C = " +  ((double) Math.round(output * 100)/100) + " degrees F");
			}
			System.out.println();
			choice = Console.getString("Another conversion? (y/n): ", "y", "n");
			System.out.println();
		}
		System.out.println("Goodbye");
		
	}

}
