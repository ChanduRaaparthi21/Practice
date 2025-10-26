//program to demonstrate Multiple inharitance in java by using Interfaces

class A
{
	void methodA()
	{
		System.out.println("iam methodA from class A");
	}
}
interface B
{
	void methodB();
}
interface C
{
	void methodC();
	
}
class D extends A implements B,C
{
	public void methodB()
	{
		System.out.println("iam methodB from class D");
	}
	
	public void methodC()
	{
		System.out.println("iam methodC from class D");

	}
}

class Multipleinh
{
	public static void main(String[] arr) {
		
		D ob = new D();
		ob.methodA();
		ob.methodB();
		ob.methodC();
				
	}
}