package basic_JavaPrograms;
import java.util.Scanner;
class binary
{
	public static void main(String []args)
	{
		System.out.print("Enter a number");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		boolean binary=true;
		int temp;
		while(x!=0)
		{	
			temp=x%10;
			if(temp>1)
			{
				System.out.print("Not a binary number");
				binary=false;
				break;
			}
			x=x/10;
		}
		if(binary==true)
		System.out.print("Its Binary Number");
	}
}
		