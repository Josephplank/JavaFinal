import java.util.Scanner;

public class maleAndFemalePercantage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double numberOfMales;
		double numberOfFemales;
		double femalePercent;
		double malePercent;
		double classTotal;
		
		System.out.println("How many males are in the class?");
		numberOfMales = scanner.nextDouble();
		
		System.out.println("How many females are in the class?");
		numberOfFemales = scanner.nextDouble();
		
		classTotal = numberOfMales + numberOfFemales;
		malePercent = numberOfMales / classTotal;
		femalePercent = numberOfFemales / classTotal;
		
		System.out.println("Male Percent in class: " + malePercent + "\nFemale Percent in class: " + femalePercent);

	}

}
