import java.util.*;
public class Question9 {
	public static void main(String[] args)
	{
		int max = Integer.MIN_VALUE;
		System.out.println("Enter 10 numbers:");
		Scanner input=new Scanner(System.in);
		for(int i=1;i<10;i++)
		{
			int num=input.nextInt();
			if(num>max)
			{
				max=num;
			}
		}
		System.out.println("Largest Number is:"+max);
	}

}
