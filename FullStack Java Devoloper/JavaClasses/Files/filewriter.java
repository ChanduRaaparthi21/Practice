import java.io.*;

class filewriter
{
	public static void main(String arr[])throws Exception
	{
		//open the file in write mode
		FileWriter fw = new FileWriter("cccc.txt",true);
	
		//connect filewriter fw with bufferedwriter
		
		BufferedWriter bw = new BufferedWriter(fw);
		//write the contents into the file
		
		//char c[]= {'c','h','a','n','d','u'};
		//bw.write(c,0 ,6 );
		
		
		String s = " male";
bw.write(s, 0, s.length());		


	//close the file
		bw.close();
		fw.close();
		
	}
	
}