package javaPrograms;
import java.io.*;
import java.util.*;
class missingNumber
{
	public static void main(String []args) throws IOException
	{
		int a[]={3, 4, 6, 14, 11};
		Arrays.sort(a);
		List<Integer> arr= new ArrayList<Integer>();
		int j=a[0];
		if(a[0]!=1)
		for(int k=1;k<a[0];k++)
		{
			arr.add(k);
		}
		for(int i=0;i<a.length;i++)
		{
			if(j==a[i])
			{
				arr.add(j);
				j++;
				continue;
			}
			else
			{
				arr.add(j);
				i--;
				j++;
			}
		
		}
		for(int r:arr)
		{
			System.out.print(r+" ");
		}
	}
}