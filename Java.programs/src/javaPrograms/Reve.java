package javaPrograms;
import java.util.Scanner;
class Reve
{
	public static void main(String a[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number to check palindrome");
		int x= 0, y;
		x = scan.nextInt();
		y=x;
		int rev=0;
		while(x!=0)
		{
			rev=rev*10;
			rev=rev+x%10;
			x=x/10;
		}
	if(y==rev){
	System.out.print("Its palindrome");}
	else{
	System.out.print("revrse number is"+ rev);}

	}
}

			