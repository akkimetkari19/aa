package constructor_this_exercise;

import java.security.PublicKey;

public class Customer {
	public String customerName;
	public long contactNumber;
	public String address;
	
	public Customer(String customerName, long contactNumber, String address) {
		// TODO Auto-generated constructor stub
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;}
	
		
	public void displayCustomerDetails()
	{
		System.out.println("Customer Name :" +customerName);
		System.out.println("Contact number:" + contactNumber);
		System.out.println("Address :" + address);
		System.out.println();
		
	}
	}
	
	
	
		
	
	
	

