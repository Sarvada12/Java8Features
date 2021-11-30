package newfeatures;

//Perform Arithmetic Operation usig Lambda
public class LambdaDemo4 {

	public static void main(String[] args) {
		Addition op1=(a,b) -> (a+b);
		System.out.println("Addition of two numbers is : "+op1.calculate(200,120));
		
		Addition op2=(a,b) -> (a-b);
		System.out.println("Subtraction of two numbers is : "+op2.calculate(200,120));
		
		Addition op3=(a,b) ->(a*b);
		System.out.println("Multiplcation of two numbers is : "+op3.calculate(200,120));
		
		Addition op4=(int a,int b) ->(a/b);
		System.out.println("Division of two numbers is : "+op4.calculate(200,120));
		
		
		//lambda expression with noparameter
				MyString myName1 =name -> {return "Hello " +name;};

				System.out.println(myName1.myStringFunction("james Gosling"));
				
	}

}
