import java.util.*;

public class CircleLauncher {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in);
		
		//variables
		double userRadius;
		
		//input
		System.out.println("What is the radius?");
		userRadius = keyBoard.nextDouble();
		
		//object
		Circle r1 = new Circle(userRadius);
		
		//output
		System.out.printf("The area of the circle is: %.2f\n", r1.getArea());
		System.out.printf("The diameter of the circle is: %.2f\n", r1.getDiameter());
		System.out.printf("The circumference of the circle is: %.2f\n", r1.getCircumference());
	}

}
