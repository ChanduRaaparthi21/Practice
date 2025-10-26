//program to demonstrate ArrayList in java

import java.util.*;

class ArrayListEx
{
	
	public static void main(String arr[])
	{
		
		ArrayList list = new ArrayList();
		list.add("chandu");
		list.add("sai");
		list.add(1,"pavan");
		list.add(2,"siva");
		list.add(3,"kittu");

		System.out.println(list);
		
		System.out.println("is list contains sai : "+list.contains("sai"));
		System.out.println("in the list 3 element is : "+list.get(3));
		System.out.println("size of the list :"+list.size() );
		
		
		ListIterator<String> li = list.listIterator();
		
		while(li.hasNext())

		{
			String s=li.next();
			System.out.println("hello"+s+"welcome");
		}


		


		
	}
	
}