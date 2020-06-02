import java.math.BigDecimal;
import java.text.NumberFormat;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator App!");
		System.out.println();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			BigDecimal loan = new BigDecimal(Console.getDouble("Enter loan ammount: "));
			BigDecimal interest = new BigDecimal(Console.getDouble("Enter interest rate (ex. 0.07216): "));
			System.out.println();
			System.out.println("Loan amount: " + NumberFormat.getCurrencyInstance().format(loan));
			System.out.println("Interest rate: " + (NumberFormat.getPercentInstance().format(interest)));
			System.out.println("Interest paid: " + NumberFormat.getCurrencyInstance().format(loan.multiply(interest)));
			System.out.println();
			choice = Console.getString("Another interest rate? (y/n): ", true);
			System.out.println();
		}
		System.out.println("Goodbye");
	}

}
