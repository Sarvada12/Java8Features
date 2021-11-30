package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		
Order od1=new Order(1000,"GOOG.NS",1200.12,Order.Side.BUY);
Order od2=new Order(3000,"MS.NS",2500.86,Order.Side.BUY);

List<Order> orderBook=new ArrayList<Order>();

orderBook.add(od1);
orderBook.add(od2);

//Sort all orders based on Quantity using Lambda
System.out.println("Before Sorting "+orderBook );//invoke toString() method

	Collections.sort(orderBook,(a,b)-> Order.compareByQuantity(a, b));
	System.out.println("After Sorting :"+orderBook);
	
	//Sort all orders based on Quantity using Method Reference
Collections.sort(orderBook,Order::compareByQuantity);
System.out.println("After Sorting :"+orderBook);

//Sort all orders based on price using Method Reference by calling instance
Order order=orderBook.get(0);//we required reference of object

Collections.sort(orderBook,order::compareByPrice);
System.out.println("After Sorting by price:"+orderBook);

//method Reference example for Arbitury Object of a particular type
String[] symbols= {"GOOGLE","amazon","microsoft","APPLE"};
	Arrays.sort(symbols,String::compareToIgnoreCase);
	
	for(String i:symbols)
	System.out.println(i);
	
	
	}

}
