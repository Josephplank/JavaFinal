
public class TempuratureClass {

	private double ftemp;
	
	public TempuratureClass(double ftemp) {
		this.ftemp = ftemp;
	}

	public void setFahrenheit(double ftemp)
	{
		this.ftemp = ftemp;
	}
	
	public double getFahrenheit()
	{
		return ftemp;
	}
	
	public double getCelsius()
	{
		return ((double)5/9) * (ftemp - 32);
		
	}
	
	public double getKelvin()
	{
		return ((5/(double)9) * (ftemp - 32))+273;
		
	}
}
