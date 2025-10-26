//program to demonstrate stringbuffer conscept
class append{
	public static void main(String[] arr){
		//creating StringBuffer object
		
		StringBuffer s = new StringBuffer();
		
		System.out.println("s value is :"+s);
		System.out.println("s value is :"+s.hashCode());
		s.append(10);
		System.out.println("s value is :"+s);
		System.out.println("s value is :"+s.hashCode());
		s.append("hello");
		System.out.println("s value is :"+s);
		System.out.println("s value is :"+s.hashCode());

		//inserting
		s.insert(1,"chandu");
		
		System.out.println("s value is :"+s);
        
		//deleting
		s.delete(2,5);
		System.out.println("s value is :"+s);
		
		//revesre
		s.reverse();
		System.out.println("s value is :"+s);
		
		//replace
		
		s.replace(2, 4,"ab");
		System.out.println("s value is :"+s);

		//substring
		s.substring(3,5);
		System.out.println("s value is :"+s);

		
		

	}
}