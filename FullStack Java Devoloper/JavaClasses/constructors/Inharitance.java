//program to demonstarte inharitance

class A
{
	int p;
	A(){} //empty constroctur
	A(int a) //single parameter constractur
	{
		p=a;
	}
	 void display()
	 {
		 System.out.println("Iam base class method dispaly.my variable p value is :"+p);
	 }
}

class B extends A
{
	int q;
	B(){}
	B(int a,int b)
	{
		p = a;
		p = b;		
	}
	
	void show()
	{
		System.out.println("iam detived class method show.my variable q value is:"+q);
		
	}
	
	
}

class Inharitance{
	public static void main(String[] arr) {
		
		B value = new B(25,40);
		value.show();
		
		value.display();
	}
}