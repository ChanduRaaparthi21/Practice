//program to demonstrate user defind exception

class MyException extends Exception
{
	MyException(){
		System.out.println("This competition for 10 years below children only");
	}
	MyException(String str){
		super(str);
		
	}
}


class UserException
{
	public static void main(String arr[]) throws Exception
	{
		try {
		int age=11;
		
		 if(age>10)
			 throw new MyException("rey idhi pillalaki");
		}
		catch(Exception e)
		{
			System.out.println("please enter correct num");
		}
		String name="chaandu";
		int len = name.length();
	try {	
		if(len>=7)
			System.out.println("valid name");
		else
			throw new MyException("please enterd minimum seven characers");
	}
	catch(MyException e) {
		System.out.println("wrong name entered");
	}
			  System.out.println("hello");
	}
}