import java.util.Scanner;

public class Question6 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Enter first integer:");
		num1= input.nextInt();
		System.out.print("Enter second integer:");
		num2= input.nextInt();
		if(num1 > num2)
			System.out.printf("%d is larger than %d\n",num1,num2);
		if(num1 < num2)
			System.out.printf("%d is larger than %d\n", num2,num1);
		if(num1 == num2)
			System.out.println("these numbers are equal");
	}
}
