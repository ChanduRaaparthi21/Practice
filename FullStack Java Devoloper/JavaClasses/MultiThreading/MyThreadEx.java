//program to demonstrate multithreading in java

 //step 1 : create a subclass of Thread class

class Mythread extends Thread
{
	String tname;
	Mythread(String s)
	{
		tname = s;
	}
	//srep 2 : write a run method
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println(tname+":"+i);
			
			
		}
	}
}


class MyThreadEx
{
	public static void main(String arr[])
	{
		System.out.println("main thread starts");
		
	   Thread t = Thread.currentThread();
	   System.out.println(t);
	   
	   ThreadGroup cr = new ThreadGroup("chandu");
	   
	   //step3 create an object above class
	   Mythread th = new Mythread("first");
	   
	   //step4 create an object for the thread classand link it with above object th
	   Thread tr = new Thread(cr,th);
       tr.setName("first");
       tr.setPriority(7);
       tr.setDaemon(true);
	   System.out.println(tr);
	   
	   //step5 run the thread using start() method
	   tr.start();
	   
	   
	   try {
		   tr.join();
	   }
	   catch(Exception e) {}
	   
	   //child thread or second thread
	   //same as above comments
	   Mythread th1 = new Mythread("second");
	   Thread tr1 = new Thread(cr,th1);
       tr1.setName("second");
       tr1.setPriority(Thread.MIN_PRIORITY);
	   System.out.println(tr1);
	   tr1.start();
	   
	   try {
		   tr1.join();
		   
	   }
	   catch(Exception e) {}
	   
	   System.out.println("mian thread deamon " +t.isDaemon());
	   System.out.println("fisrt thread deamon " +tr.isDaemon());
	   System.out.println("second thread deamon " +tr1.isDaemon());

	   
	   System.out.println("mian thread ends");
		
	}
}