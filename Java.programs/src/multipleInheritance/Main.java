package multipleInheritance;

import interfacedemo2.Drawable;

public class Main implements Drawable,Showable{

	public static void main(String[] args) {
		Main m=new Main();
		m.Draw();
		m.Show();
	}

	public void Show() {
		System.out.println("Hello");
		
	}

	public void Draw() {
		System.out.println("World");
		
	}

}
