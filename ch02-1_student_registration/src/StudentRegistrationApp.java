
public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Student Registration App");
		String firstName = Console.getString("Enter first name: ", true);
		String lastName = Console.getString("Enter last name: ", true);
		String birthYear = Console.getString("Enter birth year: ", true);
		System.out.println();
		System.out.println("Welcome, " + firstName + " " + lastName + ".");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is " + firstName + "*" + birthYear);

	}

}
