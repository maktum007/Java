package basic_JavaPrograms;
class smallCapital
{
	public static void main(String []args)
	{
		String s="MAKTUM";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(65 <= ch && ch<=90)
			ch = (char) (ch+32);
			if(91<= ch && ch <=116)
			ch = (char) (ch-32);
			System.out.print(ch);
		}
	}
}