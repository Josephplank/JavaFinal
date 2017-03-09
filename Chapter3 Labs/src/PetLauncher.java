import java.util.*;
public class PetLauncher {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in);
		
		//variables
		String testPetName;
		String testPetType;
		int testPetAge;
		
		//user input
		System.out.println("Please enter your pets name: ");
		testPetName = keyBoard.nextLine();
		
		System.out.println("Please enter your pets type: ");
		testPetType = keyBoard.nextLine();
		
		System.out.println("Please enter your pets age: ");
		testPetAge = keyBoard.nextInt();
		
		//object
		Pet p1 = new Pet(testPetName, testPetType, testPetAge);
		
		//output
		System.out.println("Name: " + p1.getName() + "\nType: " + p1.getType() + "\nAge: " + p1.getAge());

	}

}
