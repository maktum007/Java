package basic_JavaPrograms;
import java.util.Scanner;
class SumofDigits
{
	public static void main(String a[])
	{
		Scanner scan = new Scanner(System.in);
		int num=0, sum=0;
		System.out.print("Enter a number");
		num=scan.nextInt();
		while(num!=0)
		{
			sum+=num%10;
			num=num/10;
		}
		System.out.print("The sum of digit is "+sum);
		scan.close();
	}
}
