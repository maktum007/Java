package basic_JavaPrograms;
class FreshJuices{
	enum FreshJuiceSize{SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}



class enumExample{
public static void main(String [] args)
{
	FreshJuices juice=new FreshJuices();
	juice.size= FreshJuices.FreshJuiceSize.SMALL;
	System.out.println("The size is "+juice.size);

}
}