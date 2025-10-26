//program to demonstrate lambda expressions

interface test
{
    void add(int x,int y);
}
class test1
{
	static void execute(test t,int x,int y)
	{
		t.add(x, y);
	}
}
/* lambda use chesthunnappudu kindha code rayakkarledhu
class subclass implements test
{
  public void add(int x,int y)
  {
    int r = x+y;
    System.out.println("result is :"+r);
  }

}  */

class LambdaEx
{
    public static void main(String arr[])
    {
        test t1 = (int x,int y) -> {int r =x+y; System.out.println("t1 result is :"+r);};
        test1.execute(t1,10,20);

        test t2 = (int x,int y) -> {int r =x+y; System.out.println("t2 addition result is :"+r);};
        test1.execute(t2,30,20);   
        }
}