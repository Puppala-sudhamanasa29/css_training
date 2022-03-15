import java.util.Scanner;

public class DateTest {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        DateClass d = new DateClass(11,9,2000);
	        System.out.println("Enter the month");
	        int myMonth = in.nextInt();
	        d.setMon(myMonth);
	        System.out.println("Enter the date");
	        int myDate = in.nextInt();
	        d.setDate(myDate);
	        System.out.println("Enter the year");
	        int myYear = in.nextInt();
	        d.setYear(myYear);
	        d.displaydmy();
	    }
	}


