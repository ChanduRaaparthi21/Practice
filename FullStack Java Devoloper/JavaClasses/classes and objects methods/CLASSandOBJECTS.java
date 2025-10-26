class human
{
	//instance variables
	
	String name;
	int age;
	
	
	//instance methods
	void talk(){
		System.out.println(name+"is talking");
	}
	void walk(){
		System.out.println(name+"is walking");

	}
}

//driver class
class CLASSandOBJECTS{
	public static void main(String[]arr) {
		
		//creating chandu objects
		human chandu = new human();
		chandu.name="chandu r";
		chandu.age=22;
		System.out.println();
	}
}