//program to demonstrate Hierarchical inharitance

class A
{
	int p;
	A(){}
	A(int p)
	{
		this.p=p;
		
	}
	void display()
	{
		
	}
}

class B extends A
{
	int q;
	B(){}
	B(int p,int q)
	{
		this.p=p;
		this.q=q;
		
	}
	void show()
	{
		System.out.println("adding of p,q is:"+(p+q));
	}
}
class C extends A
{
	int r;
	C(){}
	C(int p,int r)
	{
		this.p=p;
		this.r=r;
		
	}
	void add()
	{
		System.out.println("addition of p,r:"+(p+r));
	}
}

class Hierarchical{
	public static void main(String[] arr) {
		B obj1 = new B(56,54);
		obj1.show();
		
		C obj2 = new C(78,45);
		obj2.add();
	}
}

