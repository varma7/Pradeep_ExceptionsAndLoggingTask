package constructioncost;

import java.util.InputMismatchException;

public class HouseConstructionCost extends MaterialsRequired
{

	HouseConstructionCost(String materialType, double totalAreaOfTheHouse, String autoType) {
		
		
		super(materialType, totalAreaOfTheHouse, autoType);
	}

	public double computeCostOfConstruction() throws InputMismatchException
	{
	     if(materialType.equals("standard"))
	  {
		  return totalAreaOfTheHouse*1200.00;
	  }
	      else if(materialType.equals("above standard"))
	  {
		  return totalAreaOfTheHouse*1500.00;  
	  }
	      else if(materialType.equals("high standard") && autoType.equals("fully automated"))
	  {
		  return totalAreaOfTheHouse*2500.00;    
	  }
	      else if(materialType.equals("high standard"))
	  {
		  return totalAreaOfTheHouse*1800.00;  
	  }
	      else
	  {
		throw new InputMismatchException("Mentioned materials are not available.");  
	  }
	}
}
