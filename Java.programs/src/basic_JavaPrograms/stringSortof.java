package basic_JavaPrograms;

import java.util.*;
class stringSortof
{
	public static void main(String []args)
	{
		String [] str={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		Arrays.sort(str);
		for(String s:str)
		{
			System.out.print(s+"\t");
		}
	}
}