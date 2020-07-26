package interest;


public class SimpleInterest extends Interest{
	SimpleInterest(double principalAmount, double rateOfInterest, double noOfYears) {
		super(principalAmount, rateOfInterest, noOfYears);
	}

	public double computeSimpleInterest()
	{
	double TotalAmount=(principalAmount*noOfYears*rateOfInterest)/100;
	  return TotalAmount;
	}

}