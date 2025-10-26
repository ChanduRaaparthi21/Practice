//program to demonstrate static variables and static methods
class Javaclass
{
	String name; //instance variable
	void listen() //instance method
	{
		System.out.println(name+"is listening in the class");
			
		}
	
	
     static String board; //static variable
     static void teaching()//static method
     {
    	 
    	 System.out.println("chandu is teaching static keyword consepton"+board+" borad");
    	 
     }
}

class staticex{
	
	public static void main(String[] arr) {
		//creating an object
		Javaclass chandu = new Javaclass();
		chandu.name = "chandu r";
		chandu.listen();
		
		Javaclass.board = "white";
		Javaclass.teaching();
		
		
	}
	
	
}