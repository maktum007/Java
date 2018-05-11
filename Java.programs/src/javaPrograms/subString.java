package javaPrograms;
import java.util.*;
import java.io.*;
class subString
{
	public static void main(String []args)
	{
		String s="abcabdddc";
		int y= lengthoflongestsubstring( s);
		System.out.print("The length of Substring is"+y);

		
	}
	public static int lengthoflongestsubstring(String str)
	{
		Map<Character, Integer> mp=new HashMap<Character, Integer>();
		int n=str.length(), ans=0;
		for(int j=0,i=0;j < n;j++)
		{	
			if(mp.containsKey(str.charAt(j)))
			{	
				i= Math.max(mp.get(str.charAt(j)),i);
			}
			ans =Math.max(ans, j-i+1);
			mp.put(str.charAt(j), j+1);
		}
		return ans;
	}
}	