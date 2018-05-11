package basic_JavaPrograms;
import java.io.*;
import java.util.*;

import java.util.HashMap;
class repeatedString
{
	public static void main(String []args) throws FileNotFoundException, IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Maktum\\Desktop\\help.txt"));
		String line;
		Map<String, Integer> mp=new HashMap<String,Integer>();
		
		while((line =br.readLine()) != null)
		{
			String[] words=line.split(" ");
			for (String word : words)
			{
				if(mp.containsKey(word))
				mp.put(word, mp.get(word)+1);
				else
				mp.put(word, 1);
			}			
		}
		String mostRepeatedWord = null;
		int count = Collections.max(mp.values());
        for (Map.Entry<String, Integer> entry : mp.entrySet())
        {
             if(entry.getValue()== count)
             {
                    mostRepeatedWord = entry.getKey();
                    count = entry.getValue();
             }
        }
             
        System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
        System.out.println("Number Of Occurrences : "+count);
        br.close();
	}
}