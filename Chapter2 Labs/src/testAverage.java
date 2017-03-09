import java.util.Scanner;

public class testAverage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		double scoreOne;
		double scoreTwo;
		double scoreThree;
		double averageScore;

		//Entering test numbers
		System.out.println("Test score number 1: ");
		scoreOne = scanner.nextDouble();
		
		System.out.println("Test score number 2: ");
		scoreTwo = scanner.nextDouble();
		
		System.out.println("Test score number 3: ");
		scoreThree = scanner.nextDouble();
		
		//AVG Calculation
		averageScore = (scoreOne + scoreTwo + scoreThree) / 3;
		
		//Output
		
		System.out.println("Test 1: " + scoreOne + "\nTest 2: " + scoreTwo + "\nTest 3: " + scoreThree + "\nAverage Score: " + averageScore);
		
		
		
		
		
	}

}
