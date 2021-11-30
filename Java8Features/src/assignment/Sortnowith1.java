package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sortnowith1 {

	public static void main(String[] args) {
		List<Integer> list1 =Arrays.asList(10,53,76,84,95,35,45,67,24,15,17,19,56,79,35,68,77,12);
		
	
		Stream<Integer> a=list1.stream();
	
		System.out.println("Numbers starting with 1: ");
		List<String>list = list1.stream().map(i -> i+"").filter(i -> i.startsWith("1")).collect(Collectors.toList());
		
		System.out.println(list);
	}
	

}
