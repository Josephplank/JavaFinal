
public class Car {

	private int yearModel;
	private String make;
	private int speed;
	
	public Car(int yearModel, String make, int speed) {
		this.yearModel = yearModel;
		this.make = make;
		this.speed = speed;
	}

	public void setYear(int year)
	{
		this.yearModel = year;
	}
	public void setMake(String m)
	{
		this.make = m;
	}
	public void setSpeed(int s)
	{
		this.speed = s;
	}
	
	
	public int getYearModel()
	{
		return yearModel;
	}
	
	public String getmake()
	{
		return make;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	
	
	public void accellerate()
	{
		speed += 5;
	}
	public void brake()
	{
		speed -= 5;
	}
	
	
}
