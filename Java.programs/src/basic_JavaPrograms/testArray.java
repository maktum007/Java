package basic_JavaPrograms;
public class testArray
{
public static void main(String args[])
{
	double[] array= {1.4,3.6,5.6,6.7,7.9};
	double test =0;
	for (int i=0; i<array.length;i++)
	{
        	System.out.println(array[i]);
		test+=array[i];
	}
	System.out.println("SUM="+test);
}
}
