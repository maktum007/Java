package basic_JavaPrograms;
class Questionnaire
{
	Questionnaire()
	{	
		System.out.println("All Quetions");
	}
}

class AboutUsSection extends Questionnaire
{
	AboutUsSection()
	{
		System.out.println("About Us section");
	}
	public static void main(String[] args)
	{
		AboutUsSection e = new AboutUsSection();
		
	}
}