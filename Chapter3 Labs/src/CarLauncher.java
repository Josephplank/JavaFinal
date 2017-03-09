import java.util.*;

public class CarLauncher {

	public static void main(String[] args) {
		int testSpeed;
		
		
		Scanner keyBoard = new Scanner(System.in);
		
		
		
		System.out.println("Enter your speed: ");
		 testSpeed = keyBoard.nextInt();
		 
		 Car car1 = new Car(2015, "Honda", testSpeed);
		
		 for(int i = 1; i <= 5; ++i)
		 {
			 car1.accellerate();
				System.out.println("Your current speed is: " + car1.getSpeed());
		 }
		
		 System.out.println("STOP!");
		 
		 keyBoard.nextLine();
		 
		 for(int i = 1; i <= 5; ++i)
		 {
			 car1.brake();
				System.out.println("Your current speed is: " + car1.getSpeed());
		 }

	}

}
