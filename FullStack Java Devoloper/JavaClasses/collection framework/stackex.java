//program to demonstrate stack in java

import java.util.*;
class stackex
{
	public static void main(String arr[])
	{
		
		Stack<Integer> marks = new Stack<Integer>();
		
		//pushing elements in stack
		marks.push(99);
		marks.push(98);
		marks.push(97);
		marks.push(95);
		marks.push(96);
		marks.push(87);
		
		if(marks.empty())//it check stack is an empty or not
			System.out.println("stack is empty");
		else
			System.out.println("top of the element in stack :"+marks.peek());//return element
		
		
		System.out.println("the 95 element position in stack is:"+marks.search(95));
		
		
		marks.pop();
		System.out.println("top of the element in stack after pop :"+marks.peek());

		
		
	}
}