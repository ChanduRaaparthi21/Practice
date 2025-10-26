import java.io.*;
class filecopy
{
	public static void main(String arr[])throws Exception
	{
		FileInputStream fin = new FileInputStream("image.png");
		FileOutputStream fout = new FileOutputStream("image123.png");
		int ch;
		while((ch=fin.read())!=-1)
			fout.write(ch);
		
		fin.close();
		fout.close();
	}
	
}