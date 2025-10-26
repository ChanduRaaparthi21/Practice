//program to demonstrate Arrays in util

import java.util.*;

class ArraysEx
{
	public static void main(String arr[])
	{
		
		int marks[] = {36,18,33,98,43,76};
		System.out.print("before sorting");
		for(int i=0; i<marks.length;i++)
			System.out.print(marks[i]+"\t");
		Arrays.sort(marks);
		
		System.out.print("\nAfter sorting");
		
		for(int i=0; i<marks.length;i++)

			System.out.print(marks[i]+"\t");
			
	}
}