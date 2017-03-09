import java.util.Scanner;

public class stockCommission {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double stockTotal = 25.50 * 1000;
		double stockCommission = .02 * stockTotal;
		double totalAmount = stockTotal + stockCommission;
		
		System.out.println("Kathryn paid " + stockTotal + " for the stock" + "\nHer commission was: " + stockCommission + "\nTotal Amount: " + totalAmount);

	}

}
