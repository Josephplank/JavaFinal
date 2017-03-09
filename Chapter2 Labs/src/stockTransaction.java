
public class stockTransaction {

	public static void main(String[] args) {
		
int numberOfSharesPurchased = 1000;
double priceBoughtPerShare = 32.87;
double amountPaidForStock = numberOfSharesPurchased * priceBoughtPerShare;
double commissionForBuying = .02 * amountPaidForStock;

int numberOfSharesSold = 1000;
double priceSoldPerShare = 33.92;
double amountRecievedForStock = numberOfSharesSold * priceSoldPerShare;
double commissionForSelling = .02 * amountRecievedForStock;

double totalProfit = (amountRecievedForStock - commissionForSelling) - (amountPaidForStock - commissionForBuying);

System.out.println("Amount of money joe paid for the stock: " + amountPaidForStock);
System.out.println("Amount of commission Joe paid for buying the stock: " + commissionForBuying);
System.out.println("Amount of money Joe recieved for the stock: " + amountRecievedForStock);
System.out.println("Amount of commission Joe paid for selling the stock: " + commissionForSelling);
System.out.println("Amount of profit Joe made: " + totalProfit);
		
	}

}
