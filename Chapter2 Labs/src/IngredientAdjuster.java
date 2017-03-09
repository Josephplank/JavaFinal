import java.util.Scanner;

public class IngredientAdjuster {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double cupsOfSugarPer48Cookies = 1.5;
		double cupsOfButterPer48Cookies = 1;
		double cupsOfFlourPer48Cookies = 2.75;
		int regularBatchOfCookies = 48;
		int userNumberOfCookies;
		
		double expectedCupsOfSugar;
		double expectedCupsOfButter;
		double expectedCupsOfFlour;
		
		System.out.println("Please enter number of cookies: ");
		userNumberOfCookies = scanner.nextInt();

		expectedCupsOfSugar = (userNumberOfCookies / regularBatchOfCookies) * cupsOfSugarPer48Cookies;
		expectedCupsOfButter = (userNumberOfCookies / regularBatchOfCookies) * cupsOfButterPer48Cookies;
		expectedCupsOfFlour = (userNumberOfCookies / regularBatchOfCookies) * cupsOfFlourPer48Cookies;
		
		System.out.println("For " + userNumberOfCookies + " cookies, you'll need: " + expectedCupsOfSugar + " Cups of sugar, " + expectedCupsOfButter + " cups of butter, " + expectedCupsOfFlour + " cups of flour.");
		
		
	}

}
