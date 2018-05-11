package javaPrograms;
class passbyReference
{
	public static void main(String [] args)
	{
		Animals a= new Animals("Tiger");
		System.out.print("before swap a1:- "+ a +"\n");
		modify(a);
		System.out.print("after swap a1:- "+ a +"\n");
	}
	public static void modify(Animals animal)
	{
		animal.setName("Lion");
	}
}
class Animals
{
	String name;
	public Animals(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;

	}
	
}
