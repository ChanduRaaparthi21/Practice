//program to demonstrate file in java
import java.io.*;

class fileex
{
	public static void main(String arr[])
	{
		File f = new File("chandu.txt");
		
		
		//methods in file class
		System.out.println("exists():"+f.exists());
		
		if(f.exists()==true)
		{
			System.out.println("canRead() :"+f.canRead());
			System.out.println("canWrite() :"+f.canWrite());
			System.out.println("lastModified() :"+f.lastModified());
			f.delete();
			System.out.println("exists() :"+f.exists());


		}
	}
}