package javaPrograms;
class reverserec
{
	public static void main(String []args)
	{
		
		
		
		reverserec ob=new reverserec();
		String m="MaktuM";
		String s=ob.reverseString(m);
		System.out.print(s);
		
	}
	public String reverseString(String str)
	{
		if ((str==null)||(str.length() <= 1) )
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);

	}
}
