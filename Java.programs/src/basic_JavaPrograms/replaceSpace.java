package basic_JavaPrograms;
class replaceSpace
{
	public static void main(String [] args)
	{
		String str ="  My    Name is    Raj   ";
		String s=str.trim().replaceAll(" +"," ");
		System.out.print(s);
	}
}