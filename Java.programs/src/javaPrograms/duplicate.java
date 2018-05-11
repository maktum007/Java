package javaPrograms;
import java.util.*;
class duplicate
{
	public static void main(String args[])
	{
		int [] a={1,1, 3,4,23,34,1,2,7,9,3};
		Arrays.sort(a);
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
			{
				System.out.print("The repeated element"+a[i]);
			}
		}
	}
}	