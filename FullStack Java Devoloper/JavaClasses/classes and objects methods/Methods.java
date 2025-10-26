class Ex
{
	int a;
	int b;
	
	void add()
	{
		System.out.println("add reult is :"+(a+b));
	}
	void mul()
	{
		System.out.println("mul reult is :"+(a*b));
		
	}
}
class Methods{
	
	public static void main(String[] arr) {
		int p = 30;
		int q = 25;
		Ex obj1 = new Ex();
		obj1.a=p;
		obj1.b=q;
		
		obj1.add();
		obj1.mul();
	}
	
}