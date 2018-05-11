package javaPrograms;
class fibbonacci
{
	public static void main(String []args)
	{
		int a=0, b=1,c;
		System.out.print("0"+"\t"+"1"+"\t");
		for(int i=2;i<5;i++)
		{
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
			
		}
	}
}