//program to demonstrate constructors
class Example
{
	String channel;
	Example()//default constructor
	{
		channel = "telugu web guru";
	}
}
class constroctur{
	public static void main(String[]arrg) {
		Example e = new Example();
		System.out.println("channel name in e objectid:"+e.channel);
		
	}
}