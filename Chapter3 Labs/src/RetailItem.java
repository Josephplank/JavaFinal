
public class RetailItem {

	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(String itemDescription, int itemUnitsOnHand, double itemPrice) {
		this.description = itemDescription;
		this.unitsOnHand = itemUnitsOnHand;
		this.price = itemPrice;
		
	}
	
	public void setDescription(String d)
	{
		this.description = d;
	}
	public void setUnits(int u)
	{
		this.unitsOnHand = u;
	}
	public void setPrice(double p)
	{
		this.price = p;
	}
	
	public String getDescription()
	{
		return description;
	}
	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}
	public double getPrice()
	{
		return price;
	}

}
