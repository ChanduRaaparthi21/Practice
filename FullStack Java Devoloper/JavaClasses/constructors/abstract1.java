//program to demonstrate abstract class

abstract class CGovt
{
	void otherdirections()//concrete method
	{
		System.out.println("iam from otherdirection method");
	}
	
	abstract void actionsTobeTaken(); //abstract method
	
}

class AP extends CGovt
{
	void actionsTobeTaken()
	{
		System.out.println("iam from actionsTobeTacken in AP");
	}
}
class TG extends CGovt
{
	void actionsTobeTaken()
	{
		System.out.println("iam from actionsTobeTacken in TG");
	}
}

class abstract1 
{
	public static void main(String [] arr){
		
		AP ap = new AP();
		ap.actionsTobeTaken();
		ap.otherdirections();
		
		TG tg = new TG();
		tg.actionsTobeTaken();
		tg.otherdirections();
	}
}