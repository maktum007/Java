package basic_JavaPrograms;
class MyDeadLock
{
	String s1= "Java";
	String s2= "Unix";
	Thread t1= new Thread("My Thread 1")
	{
		public void run()
		{	
			while(true)
			{
				synchronized(s1)
				{	
					synchronized(s2)
					{	

						System.out.print(s1+s2);
					}
				}
			}
		
		}
	};
	Thread t2= new Thread("My Thread 2")
	{
		public void run()
		{	
			while(true)
			{
				synchronized(s2)
				{	
					synchronized(s1)
					{	

						System.out.print(s1+s2);
					}
				}
			}
		
		}
	};
	public static void main(String a[])
	{
		MyDeadLock md=new MyDeadLock();
		md.t1.start();
		md.t2.start();
	}
}



