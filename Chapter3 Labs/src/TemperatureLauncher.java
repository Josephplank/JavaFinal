import java.util.*;
public class TemperatureLauncher {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in);

		double testFtemp;
		
		
		
		System.out.println("Please enter a temuerature in Fahrenheit: ");
		testFtemp = keyBoard.nextDouble();
		
		TempuratureClass t1 = new TempuratureClass(testFtemp);
		
		System.out.printf("Fahrenheit: %.2f\n", t1.getFahrenheit());
		System.out.printf("Fahrenheit in Celsius: %.2f\n", t1.getCelsius());
		System.out.printf("Fahrenheit in Kelvin: %.2f",t1.getKelvin());
	}

}
