package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample5 {

	public static void main(String[] args) {

		//limit function
		//iterate--used to define infinite sequential stream
		Stream<Integer> evenInfiniteStream=Stream.iterate(0,n->n+2);
	
		List<Integer> evenList=evenInfiniteStream.limit(20)
		.collect(Collectors.toList());
		
		System.out.println("Even nos with Limit 20 ");
		
		System.out.println(evenList);
	
		
		
		Stream<Integer> oddInfiniteStream=Stream.iterate(1,n->n+2);
	
		//converting stream to set
		Set<Integer> oddList=oddInfiniteStream.limit(20)
				.collect(Collectors.toSet());

		System.out.println("odd nos with Limit 20 ");
		
		System.out.println(oddList);
	
		//Distinct -filter unique elements
		
		List<String> desig=Arrays.asList("Manager","Technician","Salesman","Developer","Maneger");
		
		List<String> distinctDesig=desig.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctDesig);
		
		//Skip()-skip first n elements
		Stream<Integer> evenInfiniteStream1=Stream.iterate(0,n->n+2);
		
		List<Integer> evenList1=evenInfiniteStream1.skip(5).limit(20)
		.collect(Collectors.toList());
		
		System.out.println("List Even nos with skip first 5 elements Limit 10 ");
		
		System.out.println(evenList1);
	
		//anyMatch()
		boolean match=desig.stream().anyMatch(s->s.contains("Developer"));
		System.out.println("Developer exists or not : ?"+match);
	}

}
