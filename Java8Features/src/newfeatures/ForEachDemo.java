package newfeatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* forEach() Method In Iterable Interface
Java 8 has introduced a “forEach” method in the
 interface java.lang.Iterable that can iterate 
 over the elements in the collection.
  “forEach” is a default method defined in the 
  Iterable interface. It is used by the 
  Collection classes that extend the Iterable interface to iterate elements.
  
The “forEach” method takes the Functional Interface as a single parameter i.e. 
you can pass Lambda Expression as an argument
 */
public class ForEachDemo {

	public static void main(String[] args) {

		
		List<String> languages=new ArrayList<String>();//Declare Arraylist
	

		languages.add("java");
		languages.add("pythaon");
		languages.add("C#");
		languages.add("Scala");
		languages.add("Ruby");
		languages.add("C++");
		
		System.out.println("*********Programming Languages**********");
		languages.forEach(i ->System.out.println(i));
		
		System.out.println("*****Print Elements using methode refernce*******");
		languages.forEach(System.out::println);
		
	//declare a map of customers
		Map<Integer,String> customer=new  HashMap<Integer,String>();
		
		//add elements into map
		
		customer.put(101,"Alex");
		customer.put(102,"Ash");
		customer.put(103,"mike");
		customer.put(104,"Navin");
		customer.put(105,"jack");
		System.out.println("****Custome account  no & Name :*********");
		customer.forEach((k,v) -> System.out.println("key = "+ k+" ----> value = "+v));
		
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		
		//use lambda expression to print elements of arraylist
		System.out.println("****ArrayList Contents**");
		arrL.forEach(i -> System.out.println(i));
		
		
		
		//use lambda expressions to print even nos in arraylist
		System.out.println("****even numbers in ArrayList Contents**");
		arrL.forEach(n -> {if(n % 2 ==0)System.out.println(n);});
		
		
	}

}
