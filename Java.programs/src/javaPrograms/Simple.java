package javaPrograms;
class FreshJuice1{
	enum FreshJuiceSize{SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}



class Simple{
public static void main(String [] args)
{
	FreshJuice1 juice=new FreshJuice1();
	juice.size= FreshJuice1.FreshJuiceSize.MEDIUM;
	System.out.println("The size is "+juice.size);

}
}