package javaPrograms;
import java.util.Scanner;
class primeNum
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number to check prime no or not");		
		boolean isprime=true;
		int x= scan.nextInt();
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
			{
				isprime=false;
				break;
			}
			
		}
		if(isprime==true)	
		System.out.print("Prime number");
		else
		System.out.print("Not a Prime number");	
		
	}
}