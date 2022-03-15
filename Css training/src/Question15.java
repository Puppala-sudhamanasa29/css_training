
public class Question15 {
	private String firstName;
	private String lastname;
	private double salary=0;
	
	//defult constructor
	
	public Question15() {
	}
	public Question15(String first, String last, double salary) {
		this.firstName= first;
		this.lastname= last;
		this.salary = salary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName= firstName;	
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

		


