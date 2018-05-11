package javaPrograms;
import java.util.*;
class removeChar
{
	public static void main(String a[])
	{
		String s="My Name is Maktum";
		String str="";
		System.out.print("The String is..  "+s+"\n");
		System.out.print("Enter a character to delete\n");  	        
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		
		char[] cha=s.toCharArray();
		for(char c:cha)
		{
			if(c!=ch)
			{
				str+=c;
			}
		}
		System.out.print(str);
	}
}
