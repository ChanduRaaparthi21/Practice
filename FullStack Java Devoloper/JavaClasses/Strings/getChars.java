class getChars{
	public static void main(String[] arr) {
		String s = "welcome to telugu web guru";
		char a[] = new char[100];
		
		s.getChars(5,7,a,1);
		
		System.out.println(a[1]);
	}
}