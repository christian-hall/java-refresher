
public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Converter Application");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int grade = Console.getInt("Enter whole number grade: ", -1, 101);
			if (grade > 93) {
				System.out.println(grade + " = A");
			} else if (grade > 89) {
				System.out.println(grade + " = A-");
			} else if (grade > 86) {
				System.out.println(grade + " = B+");
			} else if (grade > 83) {
				System.out.println(grade + " = B");
			} else if (grade > 79) {
				System.out.println(grade + " = B-");
			} else if (grade > 76) {
				System.out.println(grade + " = C+");
			} else if (grade > 73) {
				System.out.println(grade + " = C");
			} else if (grade > 69) {
				System.out.println(grade + " = C-");
			} else if (grade > 66) {
				System.out.println(grade + " = D+");
			} else if (grade > 63) {
				System.out.println(grade + " = D");
			} else if (grade > 59) {
				System.out.println(grade + " = D-");
			} else {
				System.out.println(grade + " = F");
			}
			
			System.out.println();
			choice = Console.getString("Enter another grade? (y/n): ", "y", "n");
			System.out.println();
		}
		
		System.out.println("Goodbye");

	}

}
