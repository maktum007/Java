package javaPrograms;
import java.util.Scanner;
class armStrong
{
	public static void main(String args[])
	{
		int n, n2, sum=0;
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter number to check armStrong number\n");
		n=scan.nextInt();
		n2=n;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(sum==n2)
		System.out.print("Its Armstong number");

	}
}
		