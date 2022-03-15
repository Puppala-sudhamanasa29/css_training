
public class SavingsAccount {
	    private static double annualInterestRate;
	    private double savingsBalance;
	    // private float monthlyInterest;
	    public SavingsAccount()
	    {
	        annualInterestRate=0.0;
	        savingsBalance=0.0;
	    }
	    public SavingsAccount(double intRate, double savBal)
	    {
	        annualInterestRate=intRate;
	        savingsBalance=savBal;
	    }
	    public double calculateMonthlyInterest()
	    {
	        double intRate = (savingsBalance*annualInterestRate)/12;
	        savingsBalance = savingsBalance+intRate;
	        return intRate;
	    }
	    public static void modifyInterestRate(double newInterestRate)
	    {
	        annualInterestRate=newInterestRate;
	    }
	    public void setSavingsBalance1(double newBal)
	    {
	        savingsBalance=newBal;
	    }
	    public double getSavingsBalance()
	    {
	        return savingsBalance;
	    }
	    public double getannualInterestRate()
	    {
	        return annualInterestRate;
	    }
		public void setSavingsBalance(double newBal) {
			// TODO Auto-generated method stub
			
		}
	}
	


