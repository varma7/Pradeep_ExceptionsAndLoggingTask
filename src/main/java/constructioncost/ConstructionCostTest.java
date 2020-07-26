package constructioncost;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ConstructionCostTest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		final Logger LOGGER = LogManager.getLogger(ConstructionCostTest.class);
		LOGGER.debug("Enter the type of the material you need :standard/above standard/high standard ?");
		String materialType=sc.next();
		
		LOGGER.debug("Enter the total area of the house");
		double totalAreaOfTheHouse=sc.nextDouble();
		
		LOGGER.debug("Enter the type of automation you need :not automated/fully automated ");
		String autoType=sc.next();
		MaterialsRequired mr=new MaterialsRequired();
		try {
			LOGGER.debug("The total cost of house construction is: "+mr.calculateHouseConstructionCost(materialType,totalAreaOfTheHouse,autoType));
		}
		catch(Exception e)
		{
			LOGGER.error(e);
		}
		finally
		{
			sc.close();
		}
	}

}