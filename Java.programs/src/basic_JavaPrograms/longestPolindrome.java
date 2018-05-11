package basic_JavaPrograms;
class longestPolindrome
{
	public static void main(String []args)
	{
		String s="9912333321456";
		String longest =s.substring(0,1);
		for(int i=0;i<s.length()-1;i++)
		{
			String palindrome=intermediate(s, i, i);
			if(palindrome.length()>longest.length())
			{
				longest=palindrome;
			}
			palindrome=intermediate(s, i, i+1);
			if(palindrome.length()>longest.length())
			{
				longest=palindrome;
			}
			
		}System.out.print("The palindrome is "+longest);
	}
	public static String intermediate(String s, int left, int right)
	{
		while(left>=0 && right <s.length() && s.charAt(left) == s.charAt(right))
		{
			left--;
			right++;
		}
		return s.substring(left+1, right);
	}
}
