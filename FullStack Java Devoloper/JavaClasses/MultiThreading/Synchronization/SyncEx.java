//program to demonstrate synchronization in java

class ticketbooking
{
	boolean booked=false;
	public void bookTicket(String name)
	{
		synchronized(this) {
			if(booked==false) {
				
				System.out.println(name+" select the seat");
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {}
				
				
				
				System.out.println(name+" complete the payment");
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {}
				
				
				
				System.out.println(name+" get the ticket");
				
				booked=true;
				
				
			}
			else
			{
				System.out.println("sorry"+name+",This ticket was already booked");
			}
			
		}
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		
		System.out.println(name+" booked bus tickrt");
		
	}
}

class threadclass extends Thread
{
	ticketbooking tkt;
	String name;
	threadclass(ticketbooking obj,String s)
	{
		tkt=obj;
		name=s;
	}
	public void run()
	{
		tkt.bookTicket(name);
	}
}



class SyncEx
{
	public static void main(String arr[])
	{
		ticketbooking seat7=new ticketbooking();
		threadclass chandu = new threadclass(seat7,"chandu");
		Thread cha = new Thread(chandu);
		cha.start();
		
		
	
		threadclass pawan = new threadclass(seat7,"pawan");
		Thread paw = new Thread(pawan);
		paw.start();
	
	}
}