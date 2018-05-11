package basic_JavaPrograms;
import java.util.Arrays;
public class SortArray
{
	public static void main(String [] args)
	{
		int s[]={1, 7, 3, 6, 7, 3};
		Arrays.sort(s);
		for(int num:s)
		{
			System.out.println(num);
		}
		
	}
}
