
public class TestScores {

	//variables
	private double testScore1;
	private double testScore2;
	private double testScore3;
	
	//constructor
	public TestScores(double one, double two, double three) {
		this.testScore1 = one;
		this.testScore2 = two;
		this.testScore3 = three;
	}
	
	//gets test1
	public double getTest1()
	{
		return testScore1;
	}
	//gets test2
	public double getTest2()
	{
		return testScore2;
	}
	//gets test3
	public double getTest3()
	{
		return testScore3;
	}
	//calculates average
	public double calcAverage()
	{
		return (testScore1 + testScore2 + testScore3) / 3;
	}

}
