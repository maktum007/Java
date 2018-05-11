package basic_JavaPrograms;

public class ReverseSring {

	public static void main(String[] args) 
	{
		String s="read";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println(rev);

	}

}
