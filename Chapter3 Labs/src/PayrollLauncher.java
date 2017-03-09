import java.util.*;

public class PayrollLauncher {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in);
		
		//variables
		String testName;
		int testidNumber;
		double testHourlyPay;
		double testHoursWorked;
		//user input 
		System.out.println("What is your name?");
		testName = keyBoard.nextLine();
		System.out.println("What is your ID number?");
		testidNumber = keyBoard.nextInt();
		System.out.println("What is your hourly pay rate?");
		testHourlyPay = keyBoard.nextDouble();
		System.out.println("How many hours did you work?");
		testHoursWorked = keyBoard.nextDouble();
		//object
		Payroll e1 = new Payroll(testName, testidNumber, testHourlyPay, testHoursWorked);
		
		//Output
		System.out.println("Name: " + e1.getName() + "\nID Number: " + e1.getidNumber() + "\nPay Rate: " + e1.getHourlyPayRate() + "\nHours Worked: " + e1.getHoursWorked() + "\nGross Pay:" + e1.getGrossPay());
	}

}
