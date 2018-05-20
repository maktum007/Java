package interfaceInheritance;

public class A implements Showable {

	public static void main(String[] args) {
		A a=new A();
		a.prints();
		a.Show();
		a.msg();
		System.out.println(Printable.cube(5));

	}

	public void prints() {
		System.out.println("printing");
		
	}

	public void Show() {
		System.out.println("Showing");
		
	}

}
