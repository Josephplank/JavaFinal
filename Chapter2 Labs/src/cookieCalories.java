import javax.swing.JOptionPane;

public class cookieCalories {

	public static void main(String[] args) {
		
		String userInput;
		double numCookies;
		double numCalories;
		double numServings;
		
		userInput = JOptionPane.showInputDialog("How many cookies did you have?");
		numCookies = Double.parseDouble(userInput);
		numServings = (numCookies / 40) * 10;
		numCalories = (numServings / 1) * 300;
		
		JOptionPane.showMessageDialog(null, numCookies + " Cookies is equal to " + numCalories + " Calories (" +numServings + " Servings)");
		
		
System.exit(0);		

	}

}
