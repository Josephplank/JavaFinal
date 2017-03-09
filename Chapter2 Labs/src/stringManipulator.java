import java.util.Scanner;

public class stringManipulator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String favoriteCity;
		
		System.out.println("What is your favorite city?");
		favoriteCity = scanner.nextLine();
		
		System.out.println("The number of characters in " + favoriteCity + " is " + favoriteCity.length());
		System.out.println(favoriteCity.toUpperCase());
		System.out.println(favoriteCity.toLowerCase());
		System.out.println("The first character in " + favoriteCity + " is: " + favoriteCity.charAt(0) );
		

	}

}
