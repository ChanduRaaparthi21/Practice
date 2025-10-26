//program to demonstrate stringtokenizer

import java.util.*;

class StringTokenizerEx
{
	public static void main(String arr[])
	{
		String s = "Hello subscriber,welcome to telugu web guru";
		StringTokenizer st = new StringTokenizer(s,",");
		System.out.println(st.countTokens());
		while(st.hasMoreElements())
			System.out.println(st.nextElement());
		
	}
	
	
}