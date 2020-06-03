
public class Customer extends Person {
	
	public String customerNumber;

	public Customer(String firstName, String lastName, String customerNumber) {
		super(firstName, lastName);
		this.customerNumber = customerNumber;
	}
	
	

	public Customer(String firstName, String lastName) {
		super();
	}



	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}


	@Override
	public String toString() {
		return "You entered a new customer: \n " + super.toString() + "\nCustomer Number: " + customerNumber;
	}
	
	

}
