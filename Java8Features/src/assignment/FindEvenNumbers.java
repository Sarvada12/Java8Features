package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEvenNumbers {
	
	public static void main(String[] args) {

		List<Integer> list1 =Arrays.asList(10,53,76,84,95,35,45,67,24,56,79,35,68,77);
		Stream<Integer> a=list1.stream();
		
		List<Integer> list1Even=a.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even no in list" +list1Even);

		
	}
}
