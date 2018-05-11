package basic_JavaPrograms;
import java.util.*;

public class sortChar
{
	public static void main(String [] args)
	{
		String str="zxedqa";
		char[] arr=new char[6];
		int greater;
		char []s=str.toCharArray();
		for(int i=0;i<s.length;i++)
        	{
            		greater=0;
            		for(int j=0;j<s.length;j++)
            		{
                		if(s[i]>s[j])
				{
					greater++;
				}
                	}
                arr[greater]=s[i];
			
                }
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
        }
}