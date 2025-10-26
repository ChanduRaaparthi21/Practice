//program to demonstrate Exception handling

class ExceptionEx1
{
	public static void main(String arr[])
	{
		try {
		System.out.println(1+2);
		System.out.println(4*5);
		System.out.println(6/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("please don't divide by zero");
			
		}
		catch(IndexOutOfBoundsException e)
		{
			
		}
	
		finally {
		System.out.println("hello");
		}
	}
}