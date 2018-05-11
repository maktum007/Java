package javaPrograms;
class Bike
{	
	void run()
	{
		System.out.print("running");
	}
}
class yamaha extends Bike
{
	void run()
	{
		System.out.print("running safely 100km/h ");
	}
	public static void main(String[] args)
	{
		Bike b =new yamaha();
		b.run();
	}
}