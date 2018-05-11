package javaPrograms;
class sortString
{
	public static void main(String []args)
	{
		String a="rwedfzs";
		char temp=0;	
		String str="";
		char [] d= a.toCharArray();
		for(int i=0;i<d.length;++i)
		{
			for(int j=0;j<d.length;j++)
			{
				if(d[j]>d[i])
				{	
					temp=d[i];
					d[i]=d[j];
					d[j]=temp;
					
				}	
			} str+=d[i];
		}
		System.out.print(d);

	}
	
}




