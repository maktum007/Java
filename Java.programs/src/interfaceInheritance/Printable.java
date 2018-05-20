package interfaceInheritance;

public interface Printable 
{
	void prints();
	default void msg()
	{
		System.out.println("Defult Method");
		
	}
	static int cube(int x)
	{
		return x*x*x;
		
	}

}
