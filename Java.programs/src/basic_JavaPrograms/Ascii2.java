package basic_JavaPrograms;
import java.util.Scanner;
class Ascii2
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		String s = scan.next();
		for(int i=0;i<s.length();i++)
		{	
			int val =s.charAt(i);
			val=val-32;
			System.out.println((char) val);
		}
	}
}