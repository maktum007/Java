package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) 
	{
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student(23,"raj",34));
		al.add(new Student(32,"dup",45));
		al.add(new Student(20,"abc",29));
		
		Collections.sort(al);
		for(Student s:al)
			System.out.println(s);
	

	}

}
