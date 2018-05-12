package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import comparable.Student;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student(23,"raj",34));
		al.add(new Student(32,"dup",45));
		al.add(new Student(20,"abc",29));
		Comparator<Student> c=new Comparator<Student>() {

			public int compare(Student a, Student b) {
				return a.getName().compareTo(b.getName());
			}
			
		};
		Collections.sort(al,c);
		for(Student s:al)
			System.out.println(s);

	}

}
