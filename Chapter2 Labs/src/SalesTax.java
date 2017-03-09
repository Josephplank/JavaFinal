import javax.swing.JOptionPane;
import java.util.Scanner; 

public class SalesTax {

	public static void main(String[] args) {
		
		
		//Variables
		final double STATE_SALES_TAX =   .055;
		final double COUNTY_SALES_TAX = .02;
		double purchaseAmount;
		double countyTax;
		double stateTax;
		double totalTax;
		double totalSales;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter the purchase amount: ");
		purchaseAmount = scanner.nextDouble();
		
		//Calculations
		countyTax = COUNTY_SALES_TAX * purchaseAmount;
		
		stateTax = STATE_SALES_TAX * purchaseAmount;
		
		totalTax = stateTax + countyTax;
		
		totalSales = totalTax + purchaseAmount;
		
		//Output
		
		System.out.println("Purchase Amount: " + purchaseAmount + "\n State Sales Tax: " + stateTax + "\n County Sales Tax: " + countyTax + "\n Total Sales Tax: " + totalTax + "\n Total Sale: " + totalSales);
		
		

	}

}
