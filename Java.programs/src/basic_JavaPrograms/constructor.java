package basic_JavaPrograms;
public class constructor
{
	int Puppyage;
	public constructor(String s)
	{
		System.out.println(s);
	}

	public void setAge(int age)
	{
		Puppyage =age;
	}

	public int getAge()
	{	
		System.out.println("The age og Doggy: " + Puppyage);
		return Puppyage;
	}

	public static void main(String [] args)
	{
		constructor con =new constructor("POOL");
		con.setAge(2);
		//con.getAge();
System.out.println("The age og Doggy: " + con.getAge());
	}
}