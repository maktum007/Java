package javaPrograms;
class A
{
	void show()
	{
    		System.out.println("Class A");
 	}
	void show1()
     	{
        	System.out.println("Class test");
     	}
}
class B extends A
{
	void show()
 	{
    		System.out.println("Class B");
 	}
	void show2()
     	{
        	System.out.println("Class test2");
     	}
}
class C extends B
{
	void show()
     	{
        	System.out.println("Class C");
     	}
	void show3()
     	{
        	System.out.println("Class test 3");
     	}
}

class javaClass
{
	public static void main(String[] args)
 	{
     		A a=new A();
     		a.show();
     		B b=new B();
     		b.show();
     		A a2=new C();
     		a2.show();
		a2.show1();
     		//a2.show2();
     	}
}