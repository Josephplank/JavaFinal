
public class simple {
	
String name;
int age;
boolean favTeam;


	public simple(String n, int a, boolean f) {
		this.name = n;
		this.age = a;
		this.favTeam = f;
		
		System.out.println("My name is " + name);
		System.out.println("I am " + age);
		
		if(favTeam){
			System.out.println("Go Giants!");
		}else{System.out.println("All other teams are terrible!");}
	}

}
