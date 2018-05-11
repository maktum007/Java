package javaPrograms;
import java.util.Scanner;
class Ascii
{
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		String s = scan.next();
		for (int i=0;i<s.length();i++)
		{	
			char a=s.charAt(i);
			int c= (int) a;
			c=c-32;
			char d =(char) c;
			System.out.println(d);
		}

	}
}
