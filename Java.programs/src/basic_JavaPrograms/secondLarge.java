package basic_JavaPrograms;
public class secondLarge
{
	public static void main(String[] args)
	{
		int arr[] = {23, 45, 89, 2, 67, 56, 90, 21};
		int largest =arr[0];
		int seclarge =arr[0];
		System.out.print("The given array is ");
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > largest)
			{	
				seclarge =largest;
				largest =arr[i];
			}
			else if(arr[i]>seclarge)
			{
				seclarge=arr[i];
			}
			
			
		}
		System.out.print("First Large"+largest+"Second large"+"\t" +seclarge);

	}
}
