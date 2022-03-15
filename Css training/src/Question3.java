import java.util.Scanner;
public class Question3
{
	public static void main(String[] args)
	{
		double celsius, fahrenheit;
		Scanner s = new Scanner(System.in);
		System.out.print("Temparature in Fahrenheit :");
		fahrenheit = s.nextDouble();
		celsius = (fahrenheit-32)*(0.5556);
		System.out.println("Temparature in celsius:"+celsius);
	}
	

}
