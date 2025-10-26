//program to demonstrate super keyword


class A
{ 
	int p=20;
	void show()
	{
		System.out.println("class A:"+p);
	}
}

class B extends A
{
	int q=45;
	int p=85;
	void show() {
		
		super.show();
		System.out.println("class B :"+super.p);
		System.out.println("class B :"+p);
		System.out.println("class B :"+q);

	}
}

class Super
{
	public static void main(String[] arr) {
		B obj = new B();
		obj.show();
	}
}