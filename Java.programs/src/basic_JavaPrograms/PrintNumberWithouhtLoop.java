package basic_JavaPrograms;
class PrintNumberWithouhtLoop
{
	public static void main(String []args)
	{
		recursivefun(1);

	}
	static void recursivefun(int n)
	{
		if(n<10)
		{	
			System.out.print(n);
			recursivefun(n+1);
		}
	}
}