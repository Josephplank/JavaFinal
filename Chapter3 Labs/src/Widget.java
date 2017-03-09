
public class Widget {

	private double widgets;
	
	public Widget(double numberOfWidgets) {
		this.widgets = numberOfWidgets;
	}
	
	public double getNumberOfWidgets()
	{
		return widgets;
	}
public double getCalcDays()
{
	return widgets / 160;
}
	
}
