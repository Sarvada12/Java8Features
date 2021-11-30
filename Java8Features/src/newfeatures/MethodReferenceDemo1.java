package newfeatures;

@FunctionalInterface
interface MyInterface
{
	void myMethod();
	}

class Test//instance class
{
	void display()//instance method
	{
		System.out.println("I am a instance Method");
	}
}
public class MethodReferenceDemo1 {

	public static void main(String[] args) {

		//traditional approach
		Test t1=new Test();
		t1.display();
		
		//java8 method reference approach
		MyInterface m1ref=t1::display; //method reference to instance method of a object
		
		m1ref.myMethod();
		
		
	}

}
