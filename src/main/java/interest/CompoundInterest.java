package interest;

import interest.Interest;

public class CompoundInterest extends Interest{

	CompoundInterest(double principalAmount, double rateOfInterest, double noOfYears) {
		super(principalAmount, rateOfInterest, noOfYears);
	}
	public double computeCompoundInterest()
	{
		double TotalAmount=(principalAmount)*(Math.pow((1+((rateOfInterest)/100)), noOfYears));
		return TotalAmount-principalAmount;
	}
}