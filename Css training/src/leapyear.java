import java.util.Scanner;

public class leapyear {
public static void main(String args[])
{
	int year;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the year");
	year = in.nextInt();
	if(year%4==0)
	{
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println("A leap year");
			}
			else
			{
				System.out.println("Not a leap year");
			}
		  
		}
		else
		{
			System.out.println("Leap year");
		}
	}
	else
	{
		System.out.println("Not a leap year ");
	}
}

}
