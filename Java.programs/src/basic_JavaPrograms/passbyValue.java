
package basic_JavaPrograms;
class passbyValue
{
	public static void main(String[] args)
	{
		Animal a1= new Animal("Lion");
		Animal a2= new Animal("Crocodile");
		System.out.print("Before swap:- a1 : "+a1+"  a2 : "+a2+"\n");

		swap(a1, a2);
		System.out.print("After swap:- a1 : "+a1+"  a2 : "+a2);
	}
	public static void swap(Animal animal1, Animal animal2)
	{
		Animal temp= new Animal("");
		temp =animal1;
		animal1 =animal2;
		animal1 =temp;
	}
}

class Animal
{
	String name;
	public Animal(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return name;
	}
}