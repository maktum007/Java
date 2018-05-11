package basic_JavaPrograms;
public class SortArraytech
{
	public static void main(String [] args)
	{
		int s[]={1, 7, 4, 6, 5, 3};
		int nums[] = new int[6];
		int greater;
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
                nums[greater]=s[i];
			
                }
		//for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[nums.length-2]);
		}
		
        }
}