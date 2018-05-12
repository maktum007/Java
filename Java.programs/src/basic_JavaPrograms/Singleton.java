package basic_JavaPrograms;
public class Singleton
{
	private static Singleton singleton = new Singleton();
	
	private Singleton()
	{	}
	
	public static Singleton getInstance()
	{return singleton;}
	
	protected void demoMethod()
	{	
		System.out.print("Demomethod for Singleton");
	}
}

	