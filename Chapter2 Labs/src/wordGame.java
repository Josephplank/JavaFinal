import java.util.Scanner;

public class wordGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		String city;
		String college;
		String profession;
		String animal;
		String petName;
		
		
		System.out.println("Please enter your name: ");
		name = scanner.nextLine();
		
		System.out.println("Please enter your age: ");
		age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Please enter your city: ");
		city = scanner.nextLine();
		
		System.out.println("Please enter your college: ");
		college = scanner.nextLine();
		
		System.out.println("Please enter your profession: ");
		profession = scanner.nextLine();
		
		System.out.println("Please enter your animal: ");
		animal = scanner.nextLine();
		
		System.out.println("Please enter your pets name: ");
		petName = scanner.nextLine();
		
		
		System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at " + 
							college + ". " + name + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) " + 
							animal + " named " + petName + ". They both lived happily ever after!");

	}

}
