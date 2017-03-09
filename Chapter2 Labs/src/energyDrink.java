

public class energyDrink {

	public static void main(String[] args) {
		
		//Defined/Calculated Variables
		int surveyedCustomers = 15000;
		double energyDrinkCustomers = .18 * surveyedCustomers;
		double citrusFlavor = .58 * energyDrinkCustomers;
		
		//Output
		System.out.println("Out of " + surveyedCustomers + " customers, " + energyDrinkCustomers 
							+ " buy one or two energy drinks and out of those, " 
							+ citrusFlavor +  " prefer citrus flavor.");

	}

}
