package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("ravi","summy","yoda","Isha");
		
		//Create a stream
		Stream<String> n=names.stream();
		
		Stream<String> ln=n.filter(str->str.length() >3);
		ln.forEach(System.out::println);

System.out.println("***********************************");

//create aStream -->Operations-->Convert stream back to collections
List<String> names1=names.stream().filter(str->str.length()>4).
collect(Collectors.toList());

System.out.println(names1);
System.out.println("*****************");

List<Integer> grades=new ArrayList<Integer>();
grades.add(10);
grades.add(86);
grades.add(53);
grades.add(18);
grades.add(43);
grades.add(18);

//Build stream from collections
Stream<Integer> strm1=grades.stream();

//filter only even grades
List<Integer> gradesEven=strm1.filter(i->i%2==0).collect(Collectors.toList());
System.out.println(gradesEven);

	}

}
