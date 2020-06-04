
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager App\n");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String firstName = Console.getString("\nEnter first name: ", true);
			String lastName = Console.getString("Enter last name:  ", true);
			String type = Console.getString("\nCustomer or employee? (c/e): ", "c", "e");
			if (type.equalsIgnoreCase("c")) {
				String number = Console.getString("Enter customer number:  ", true);
				Customer c = new Customer (firstName, lastName, number);
				System.out.println("\n" + c + "\n");
			} else if (type.equalsIgnoreCase("e")) {
				String number = Console.getString("Enter employee number:  ", true);
				Employee e = new Employee (firstName, lastName, number);
				System.out.println("\n" + e + "\n");
			}
			choice = Console.getString("\nEnter another? ","y", "n");
		}
		System.out.println("\nGoodbye");	
	}
}
