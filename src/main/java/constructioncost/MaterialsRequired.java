package constructioncost;

public class MaterialsRequired{
	
	double totalAreaOfTheHouse;
   String autoType;
   String materialType;
   
   MaterialsRequired(){
	   
   }
   MaterialsRequired(String materialType,double totalAreaOfHouse,String autoType)
   {
	   this.totalAreaOfTheHouse=totalAreaOfHouse;
	   this.autoType=autoType;
	   this.materialType=materialType;
	   
   }
   public String calculateHouseConstructionCost(String materialType, double totalAreaOfTheHouse, String automationType) throws Exception
   {
	   HouseConstructionCost hcc=new  HouseConstructionCost(materialType, totalAreaOfTheHouse, automationType);
	   String res=String.valueOf(hcc.computeCostOfConstruction())+"INR";
	   return res;
   }
}