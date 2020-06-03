
public class Employee extends Person {
	
	public String employeeNumber;

	public Employee(String firstName, String lastName, String employeeNumber) {
		super(firstName, lastName);
		this.employeeNumber = employeeNumber;
	}

	public Employee(String firstName, String lastName) {
		super();
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	@Override
	public String toString() {
		return "You entered a new customer: \n " + super.toString() + "\nEmployee Number: " + employeeNumber;
	}
	

}
