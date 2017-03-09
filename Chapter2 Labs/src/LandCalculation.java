
public class LandCalculation {

	public static void main(String[] args) {
		
		//Variables
		double ONE_ACRE = 43560;
		double givenValue = 389767; 
		
		//equation
		double numberOfAcres = (givenValue / ONE_ACRE) * 1;
		
		
		//Output
		System.out.printf("Number of acres: %.2f", numberOfAcres);

	}

}
