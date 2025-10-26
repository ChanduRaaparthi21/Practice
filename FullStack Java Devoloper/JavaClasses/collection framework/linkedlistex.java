//program to demonstrate linkedlist in java

import java.util.*;

class linkedlistex
{
	
	public static void main(String arr [])
	{
		
		LinkedList<String> List = new LinkedList<String>();
		
		List.add("chandu");
		List.add("sai");
		List.add("pavan");
		List.add("vani");
		List.add("siva");
		List.add("kittu");
		List.add("beem");
	
		List.add(3, "raaparthi");//ea index dhaggara add cheyyali ani
        List.addFirst("ramu");
        List.addLast("hai");
        System.out.println(List);
		
        System.out.println("is List contains chandu ?"+List.contains("chandu"));
        

        System.out.println("first element is : "+List.getFirst());//list lo unna first String vasthundhi
        System.out.println("last element is : "+List.getLast());
        System.out.println(" element at index 4 : "+List.get(4));//manaki ea index lo kavalo aa index lo vasthindhi
        System.out.println("no of elements in the list "+List.size());
        
        for(String s:List)
        	System.out.println("Hello "+s+" welcome to java classes ");

 
        List.remove(2);//ea index lo name remove cheyyalo indicate chesthundhi
	}
}