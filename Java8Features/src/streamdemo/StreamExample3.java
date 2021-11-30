package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<>();
		names.add("Amit");
		names.add("Shekar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Sonam");
		names.add("Salman");
		names.add("Lokesh");
		names.add("Navin");
		System.out.println();
		names.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
	
	System.out.println("*************soreted Operation*********");
	
	names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

	
	//Collect operation--> convert stream to list
	List<String> namesUpperCase=names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());

	System.out.println("*********New List**********");
	System.out.println(namesUpperCase);
	
	//Count Operation
	long cnt=names.stream().count();
	System.out.println("No of elemnts :"+cnt);
	
	long cnt1=names.stream().filter((s)->s.startsWith("A")).count();
	System.out.println("No of names starting with A: "+cnt1);
	
	//reduce operation--combines elemets of stream and produce a single value
	Optional<String> red=names.stream().reduce((s1,s2) ->s1+"#"+s2);
	
	Integer[] marks= {42,8,61,6,233,5631};
	int sum=Arrays.stream(marks).reduce(0,(a,b)->a+b );
	System.out.println("sum of Marks "+sum);
	
	/* 
	 * display nos from 1-100
	 * 1.loops
	 * 2.Streams
	 */
	for(int i=1;i<=100;i++) {
		System.out.println(i+" ");
	}
	System.out.println();
	
	System.out.println("Display nos from 1-100 using Int streams");
	
	IntStream.range(1, 101).forEach(i->System.out.println(i+" "));
	
	}

}
