//program to demonstrate multi level inharitance

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
		
	}
}

class C extends B
{
	int r;
	C(){}
	C(int p,int q,int r)
	{
		this.p=p;
		this.q=q;
		this.r=r;
		
	}
	void add()
	{
		System.out.println("addition of p,q,r is :"+(p+q+r));
	}
}



class Multilevel{
	
	public static void main(String[] arr) {
		
		C obj = new C(55,879,4547);
		obj.add();
	}
}