class split{
	public static void main(String[] arr) {
		String s = "welcome to telugu web guru";
		String res[] = s.split(" ");
		System.out.println("res length is :"+res.length);
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);
	}
}