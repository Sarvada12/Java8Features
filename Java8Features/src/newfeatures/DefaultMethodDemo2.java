package newfeatures;

import java.time.LocalDate;

//java 8 allows to  add functionality to interface
interface Parser{


	default void parse(){

		System.out.println("default Parsing logic");
}
	static void displayDate()
	{
		System.out.println(LocalDate.now());
	}}
class TextParser implements Parser{
	//inherit default implementation of parse
	void display()
	{
		System.out.println("Hello Text parser");
	}
	
}
class XMLParser implements Parser{
	public void parse(){

		System.out.println("Parsing External files");
}
	
}

public class DefaultMethodDemo2 {

	public static void main(String[] args) {

		Parser p=new TextParser();
		p.parse();//invoke default method in interface
		
		 TextParser p1=new TextParser();
		p1.display();
		
		p=new XMLParser();//reference  child class XMLParser
		p.parse();//invoke overridden method
		
		System.out.println("Program executed on :");
		Parser.displayDate();//invoke static method
	}

}
