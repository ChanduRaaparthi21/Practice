//program to demonstrate hashset in java
import java.util.*;
class HashsetEx
{
	public static void main(String arr[])
	{
		HashSet<String> names = new HashSet<String>();
		System.out.println("names.isEmpty() :"+names.isEmpty());
		
		//adding elements/objects 
		names.add("chandu");
		names.add("raaparthi");
		
		if(names.isEmpty())
			System.out.println("names hashset still empty");
		else
		System.out.println("size of the hashset names :"+names.size());
		if(names.contains("raaparthi"))
			names.remove("raaparthi");
		System.out.println("updated size of the hashset names :"+names.size());

		names.clear();
		
		System.out.println("names.isEmpty() after clear :"+names.isEmpty());

		
		names.add("chandu");
		names.add("vani");
		names.add("sai"); 
		names.add("pawan");
		names.add("ram");
		
		System.out.println(names);
		
		/* for(String n : names) //for each loop
		{
			String newvalue = "welcome  " +n;
			System.out.println(newvalue);
		} */

		Iterator<String> newNames = names.iterator(); //Iterator loop
		while(newNames.hasNext())
		{
			String n = newNames.next();
			String newvalue = "welcome  " +n;
			System.out.println(newvalue);
		}
		
		
	}
	
}