package basic_JavaPrograms;
import java.util.*;
import java.util.Map.Entry;
class DuplcateCharinString
{
	public static void main(String a[])
	{
		Map<Character, Integer> mp= new HashMap<Character, Integer>();
		String str="maktumkamdamadikm";
		char[] chrs= str.toCharArray();
		for(Character ch:chrs)
		{
			if(mp.containsKey(ch))
			{	
				mp.put(ch, mp.get(ch)+1);
			}
			else
			{
				mp.put(ch, 1);
			}
		}
		
		int count=Collections.max(mp.values());
		char repeated=' ';
		for(Map.Entry<Character, Integer> entry:mp.entrySet())
		{
			if(entry.getValue() == count)
			{
				repeated = entry.getKey();
				
		    }
		}
		System.out.print("Repeated char in String : " +repeated +"\n");
		System.out.print("Number of Occurances : " +count);
	}
}
