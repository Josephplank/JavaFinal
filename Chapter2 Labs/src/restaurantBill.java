import java.util.Scanner;

public class restaurantBill {

	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner(System.in);
		
		double mealCost;
		double tax;
		double totalCost;
		double tip;
		double yourBill;
		
		System.out.println("Please enter cost of meal: ");
		mealCost = scanner.nextDouble();
		
		tax = .075 * mealCost;
		totalCost = mealCost + tax;
		tip = .18 * totalCost;
		yourBill = totalCost + tip;
		
		System.out.println("Meal cost: " + mealCost + "\nTax Amount: " + tax + "\nTip Amount: " + tip + "\nTotal: " + yourBill );
		
	}

}
