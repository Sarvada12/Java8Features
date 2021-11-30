package newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
 * Java lambda expression can be used in the collection framework. 
 * It provides efficient and concise way to iterate, filter and fetch data
 */
public class lambdaComparatorDemo {

	public static void main(String[] args) {

		Student s1=new Student(101,"Mike",78);
		Student s2=new Student(102,"Savy",53);
		Student s3=new Student(103,"Uma",23);
		Student s4=new Student(104,"meene",88);
		Student s5=new Student(105,"rene",76);

		List<Student> sList=new ArrayList<Student>();
		sList.add(s5);
		sList.add(s4);
		sList.add(s3);
		sList.add(s2);
		sList.add(s1);

		System.out.println("Sort Students based on names :");
		
		//implementing Lambda expression to sort user
		//defined object using comparator interface methode
	
		Collections.sort(sList,(st1,st2) ->{
			return st1.name.compareTo(st2.name);
		});
		
		for(Student s:sList) {
			System.out.println(s.rollNumber+ " "+s.name+" "+s.marks);
		}
		
		//sort in descending order based on marks of a student
		System.out.println("*********Descending order based on marks :**********");
		
		Collections.sort(sList,(st1,st2) ->{
			return st2.marks.compareTo(st1.marks);
		});
	//foreach () loop
		sList.forEach(s->System.out.println(s.rollNumber+ " "+s.name+" "+s.marks));
	}

}
