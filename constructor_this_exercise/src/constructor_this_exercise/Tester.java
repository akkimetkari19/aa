package constructor_this_exercise;

public class Tester {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Akshay",878466166, "1457, old trafford, Manchester");
		Customer customer2 = new Customer("Ak",889466166, "14887, old trafford, Manchester");
		
		
		customer2.displayCustomerDetails();
		customer1.displayCustomerDetails();
		
	}

}
