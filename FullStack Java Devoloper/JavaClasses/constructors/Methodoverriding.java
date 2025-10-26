//to program to demonstrate method overriding

class A 
{
	void add(int a,int b)
	{
		System.out.println("adding in A is:"+(a+b));
		
	}
	
}

class B extends A
{
	void add(int p,int q)
	{
		super.add(p, q);
		System.out.println("adding in B :"+(p+q));
	}
}

class Methodoverriding
{
	public static void main(String[] arr) {
		
		B obj = new B();
		obj.add(55,75);
	}
	
}