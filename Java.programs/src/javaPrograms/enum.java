package javaPrograms;
class FreshJuice
{
	enum FreshJuiceSize{SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}

class enumDemo
{
	public static void main(String [] args)
	{
		FreshJuice juice=new FreshJuice();
		juice.size= FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("The size is "+juice.size);
	}
}