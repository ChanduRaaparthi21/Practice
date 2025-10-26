class A 
{
	int p,q,r;
	A(){}
	A(int p,int q,int r){
		
		this.p=p;
		this.q=q;
		this.r=r;
}
	
}
class B extends A
{
	int s,t;
	
	B(){}
	B(int p,int q,int r,int s,int t){
		
		super(p,q,r);
		this.s=s;
		this.t=t;
	}
	
	void add() {
		
		System.out.println(p+q+r+s+t);
	}
}


class Super1
{
public static void main(String[] arr)
{
 
	B obj = new B(11,22,33,44,55);
	obj.add();

}
}