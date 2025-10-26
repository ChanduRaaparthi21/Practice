//progam to demonstrate vector in java
import java.util.*;

class VectorEx
{
	public static void main(String arr[])
	{
		
		Vector<String> list = new Vector<String>(6,3);
		
		System.out.println("initial capacity : "+list.capacity());
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		
		System.out.println("capasity afyter adding 6 elements :"+list.capacity());
	list.add("g");
	System.out.println("capasity afyter adding 7th element:"+list.capacity());

System.out.println("first element in vector list : "+list.firstElement());
System.out.println("last element in vector list : "+list.lastElement());


Enumeration<String> en = list.elements();
while(en.hasMoreElements())
	System.out.println("hello"+en.nextElement());
	}
}