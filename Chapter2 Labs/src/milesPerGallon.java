import java.util.Scanner;

public class milesPerGallon {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//Variables
		double milesTraveled;
		double gallonsUsed;
		double mpg;
		
		System.out.println("Please enter miles traveled: ");
		milesTraveled = scanner.nextDouble();
		
		System.out.println("Please enter number of gallons used: ");
		gallonsUsed = scanner.nextDouble();
		
		
		//MPG Calculation
		mpg = milesTraveled / gallonsUsed;
		
		//Output
		System.out.println("Your MPG is: " + mpg);

	}

}
