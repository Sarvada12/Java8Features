package assignment;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class OperationalList {

	public static void main(String[] args) {
				List<Integer> list1 =Arrays.asList(10,53,76,84,95,35,45,67,24,56,79,35,68,77);
			
				int maximum =  list1.stream().max(Integer::compare).get();
				System.out.println("Maximum Value Element in List: "+maximum);
				
				int minimum = list1.stream().min(Integer::compare).get();
				System.out.println("Minimum Value Element in List: "+minimum);
				
				Integer sum = list1.stream().reduce(0, Integer::sum);
				System.out.println("Sum of all the valus of List: "+sum);
				
				list1.stream().mapToInt(i ->i).average().ifPresent(avg -> System.out.println("Average found is " + avg));

				

	}

}
