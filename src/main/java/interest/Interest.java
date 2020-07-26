
package interest;
public class Interest{
	double rateOfInterest;
	double noOfYears;
	double principalAmount;
	
	Interest(){
		
	}
	Interest(double principalAmount,double rateOfInterest,double noOfYears)
	{
		this.principalAmount=principalAmount;
		this.rateOfInterest=rateOfInterest;
		this.noOfYears=noOfYears;
	}
	public String getSimpleInterest(double principalAmount, double rateOfInterest, double noOfYears)
	{
	  SimpleInterest simpleInterest=new SimpleInterest(principalAmount, rateOfInterest, noOfYears);
	  String si=String.valueOf(simpleInterest.computeSimpleInterest())+"Rs/-";
	  return si;
	}
	public String getCompoundInterest(double principalAmount, double rateOfInterest, double noOfYears)
	{
	  CompoundInterest compoundInterest=new CompoundInterest(principalAmount, rateOfInterest, noOfYears);
	  String ci=String.valueOf(compoundInterest.computeCompoundInterest())+"Rs/-";
	  return ci;
	}
	
}
