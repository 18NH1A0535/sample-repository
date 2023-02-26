package mypack;

import java.util.ArrayList;
import java.util.HashMap;

class Mobile
{
	HashMap<String,ArrayList<String>> mobiles=new HashMap<>();
	ArrayList<String> models=new ArrayList<>();
	public String addMobile(String company,String model)
	{
		if(!mobiles.containsKey(company))
		{
			models.add(model);
			mobiles.put(company, models);
		}
		else
		{
			models.add(model);
		}
		return "model successfully added";
	}
	public ArrayList<String> getModels(String company)
	{
		if(!mobiles.containsKey(company)&& !mobiles.containsValue(models))
		{	
			return null;
		}
		else
		{
			return models;
		}
	}
	public String buyMobile(String company,String model)
	{
		if(mobiles.containsKey(company))
		{
			if(models.contains(model))
			{
				models.remove(model);
				return "mobile sold successfully";
			}
			else
				return "item not available";
		}
		return "item not available";
	}
}
public class mobileshopCollections {

	public static void main(String[] args) {
		Mobile obj = new Mobile();
		System.out.println(obj.addMobile("Oppo", "K3"));
		System.out.println(obj.getModels("Oppo"));
		System.out.println(obj.buyMobile("Oppo", "K3"));

	}

}
