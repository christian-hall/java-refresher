
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the person manager app!");
		System.out.println();
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			choice = Console.getString("Continue?", "y", "n");
		}

	}

}
