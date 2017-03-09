import java.util.*;

public class PersonalInfoLauncher {

	public static void main(String[] args) {
	
		
		Scanner keyBoard = new Scanner(System.in);
		
		//3 objects
		PersonalInfo p1 = new PersonalInfo("Joseph", "Stockton", 23, "209-507-2021");
		
		
		PersonalInfo p2 = new PersonalInfo("Brett", "STL", 25, "618-654-7894");
		
		
		PersonalInfo p3 = new PersonalInfo("Chandler", "Missouri", 20, "618-201-3210");
		
		//personal info output
		System.out.println("Name: " + p1.getName() + "\nAddress: " + p1.getAddress() + "\nAge: " + p1.getAge() + "\nPhone Number: " + p1.getNumber());
		System.out.println("\nName: " + p2.getName() + "\nAddress: " + p2.getAddress() + "\nAge: " + p2.getAge() + "\nPhone Number: " + p2.getNumber());
		System.out.println("\nName: " + p3.getName() + "\nAddress: " + p3.getAddress() + "\nAge: " + p3.getAge() + "\nPhone Number: " + p3.getNumber());
		}

}
