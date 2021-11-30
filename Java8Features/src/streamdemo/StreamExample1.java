package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {

		Integer[] marks= {45,88,99,45,75,23};
		
		//Build stream from arrays
		Stream<Integer> strm=Stream.of(marks);
		
		strm.forEach(i->System.out.println(i));
		
		//Build stream from Collections
		
		List<Integer> grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(86);
		grades.add(53);
		grades.add(18);
		grades.add(43);
		grades.add(18);
		
		//Build stream from collections
Stream<Integer> strm1=grades.stream();
		
//strm.forEach(i->System.out.println(i));
System.out.println("*************ArrayList Content*********");
strm1.forEach(System.out::println);

List<Integer> squares=grades.stream().map(m->m*m)
.collect(Collectors.toList());

System.out.println("*******Double of grades*****");
System.out.println(squares);
		
	}

}
