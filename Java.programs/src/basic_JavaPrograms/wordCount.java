package basic_JavaPrograms;
import java.util.Scanner;
class wordCount
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String Sentence=in.nextLine();
	
		System.out.print(countWords(Sentence));
		in.close();
	}
	public static int countWords(String str)
	{	
		int count = 1;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' '&& str.charAt(i+1)!=' ')
			{count++;}
		}
		return count;
		
	}
}