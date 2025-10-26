//program to demonstrate interface in java

interface A
{
	int p = 10; //static variable
	
	void show();
	void display();
	
}

class B implements A
{
	public void show()
	{
		System.out.println("Iam show method in B");
		
	}

	public void display()
	{
		System.out.println("Iam display method in B");
	}
	
}

class InterfaceEx
{
	public static void main(String[] arr) {
		
		B ob = new B();
		ob.show();
		ob.display();
	}
}