
public class Pet {

	//variables
	private String name;
	private String type;
	private int age;
	
	//constructor
	public Pet(String petName, String petType, int petAge) {
		this.name = petName;
		this.type = petType;
		this.age = petAge;
	}
	
	//sets name
	public void setName(String testName)
	{
		this.name = testName;
	}
	
	//sets type
	public void setType(String testType)
	{
		this.type = testType;
	}
	
	//sets name
	public void setAge(int testAge)
	{
		this.age = testAge;
	}
	
	//gets name
	public String getName()
	{
		return name;
	}
	
	//gets type
	public String getType(){
		return type;
	}
	
	//gets age
	public int getAge()
	{
		return age;
	}

}
