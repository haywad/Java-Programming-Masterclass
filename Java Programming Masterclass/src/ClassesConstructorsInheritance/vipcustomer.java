package ClassesConstructorsInheritance;

public class vipcustomer {

	private String name;
	private double creditLimit;
	private String emailAddress;
	
	public vipcustomer() {
		this("Name", 100.0, "Email");
	}
	
	public vipcustomer(String name, String emailAddress) {
		this(name, 0.0, emailAddress);
	}
	
	public vipcustomer(String name, double creditLimit, String emailAddress) {
		this(name, creditLimit, emailAddress);
	}
	
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
}