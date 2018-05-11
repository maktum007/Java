package basic_JavaPrograms;
import java.util.Scanner;
class swap
{
	public static void main(String a[])
	{
		Scanner scan =new Scanner(System.in);
		int x= scan.nextInt();
		int y= scan.nextInt();
		System.out.println("Value of x =" + x);
		System.out.println("Value of y =" + y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("Value of x Afer Swap" + x);
		System.out.println("Value of y After Swap" + y);
		

	}
}