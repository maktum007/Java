package basic_JavaPrograms;
import java.util.Scanner;
class palindrome
{
	public static void main(String []args)
	{
		String rev="";
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a name to check palindrome\n");		
		String s =scan.next();

		for(int i=s.length()-1;i>=0;--i)
		{	
			rev+= s.charAt(i);	
		}
		if(s.equalsIgnoreCase(rev))
		{
			System.out.print("Name is palindrome");
		}
		else
		{
			System.out.print("Not a Polindrome");
		}
		scan.close();
	}
}
