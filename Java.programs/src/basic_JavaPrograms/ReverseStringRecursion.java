package basic_JavaPrograms;
class ReverseStringRecursion
{
	public static void main(String []args)
	{

		System.out.println(reverseString("karnataka"));
		
		
	}
	static String reverseString(String str)
	{
		if ((str==null)||(str.length() <= 1) )
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);

	}
}
