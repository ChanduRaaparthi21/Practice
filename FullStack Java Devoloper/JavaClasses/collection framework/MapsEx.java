//program to demonstrate maps in java

import java.util.*;

class MapsEx 
{
	public static void main(String arr[])
	{
		
		HashMap<String,String> maps = new HashMap<String,String>();
		
		System.out.println("is hashmap is empty : "+maps.isEmpty());
		maps.put("fl", "telugu");
		maps.put("sl", "english");
		maps.put("tl", "hindi");

		if(maps.isEmpty())
			System.out.println("map still empty");
		
		
		else
			System.out.println("maps size is : "+maps.size());
		System.out.println("keyset() : "+maps.keySet());
		System.out.println("value: "+maps.values());
		System.out.println("entry set : "+maps.entrySet());
		System.out.println("value of the key tl is: "+maps.get("tl"));


		
	}
	
}
