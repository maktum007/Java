package javaPrograms;
import java.util.Scanner;
public class reverse
{
	public static void main(String[] args)
	{
		int n=0, reverse=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		while(n!=0)
		{
			reverse =reverse*10;
			reverse = reverse +n%10;
			n=n/10;
		}
		System.out.print("Reverse number is "+reverse);
	}
}

