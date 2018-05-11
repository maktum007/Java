package javaPrograms;
import java.util.Scanner;
import java.util.Arrays;
class anagram1
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a String -");
		String s1=scan.nextLine().replaceAll("\\s", "");
		System.out.print("Eneter another String to check anagram");
		String s2=scan.nextLine().replaceAll("\\s", "");
		char []str1=s1.toLowerCase().toCharArray();
		char []str2=s2.toLowerCase().toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		if(Arrays.equals(str1,str2)==true)
		{
			System.out.print("Both Strings are Anagram");
		}
		else
		{
			System.out.print("Not anagram");
		}
	}
}