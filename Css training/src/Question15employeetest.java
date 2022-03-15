
public class Question15employeetest {
	public void display(Question15 emp)
	{
		System.out.println("The yearly salary of" + emp.getFirstName() +" " + emp.getLastName() +" is:\t" + emp.getSalary()*12);
	}
 public void setRaise(Question15 emp) {
	 emp.setSalary(emp.getSalary()*1.1);
 }
  public static void main(String[] args) {
	  Question15 employee1=new Question15("Sudha", "Manasa",1000);
	  Question15 employee2=new Question15("Sai", "Prasanna",1000);
	  Question15employeetest emptest=new Question15employeetest();
	  emptest.display(employee1);
	  emptest.display(employee2);
	  emptest.setRaise(employee1);
	  emptest.setRaise(employee2);
	  emptest.display(employee1);
	  emptest.display(employee2);
	  
  }

}
