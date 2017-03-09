
public class PersonalInfo {

	//Variables
	
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	//constructor
	public PersonalInfo(String yourName, String yourAddress, int yourAge, String yourNumber) {
		this.name = yourName;
		this.address = yourAddress;
		this.age = yourAge;
		this.phoneNumber = yourNumber;
	}
	
	//gets name
	public String getName()
	{
		return name;
	}
	
	//gets address
public String getAddress()
{
	return address;
}
//gets age
public int getAge()
{
	return age;
}
//gets phone number
public String getNumber()
{
	return phoneNumber;
}
}
