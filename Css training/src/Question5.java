import java.util.Scanner;
public class Question5 {
	public static void main(String[] args)
	{
		int sum;
		int product;
		int difference;
		int quotient;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any two numbers:\n");
		int x=s.nextInt();
		int y=s.nextInt();
		sum=x+y;
		product=x*y;
		difference=x-y;
		quotient=x/y;
		System.out.println("Sum is:"+sum+"\n product is:"+product+"\n Difference is:"+difference+"\n Quotient is:"+quotient);
		
	}
	

}
