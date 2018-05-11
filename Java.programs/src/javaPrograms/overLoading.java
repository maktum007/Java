package javaPrograms;
public class overLoading
{
	public static void main(String[] args)
	{	
		int a=5;
		int b=7;
		double c=4.6;
		double d=6.7;
		int result =minFunction(a,b);
		System.out.println("The int minimum is"+ result);
		double result2 =minFunction(c,d);
		System.out.println("The minimum double is"+result2);
	}
	public static int minFunction(int x, int y)
	{
		int min;
		if(x<y)
			min=x;
		else
			min=y;
		return min;
	}
	public static double minFunction(double x, double y)
	{
		double min;
		if(x<y)
			min=x;
		else
			min=y;

		return min;
	}
} 