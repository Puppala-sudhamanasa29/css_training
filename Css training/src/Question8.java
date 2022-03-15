

import java.util.Scanner;
public class Question8 {
	public static void main(String args[])
	{
		int a=0,b=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two nymbers:\n");
		a=s.nextInt();
		b=s.nextInt();
		int mul=b%a;
		if(mul==0)
		{
			System.out.printf("%d is multiple of %d",a,b);
		}
		else
		{
			System.out.printf("%d is not a multiple of %d",a,b);
					
		}
					
		
	}

}
