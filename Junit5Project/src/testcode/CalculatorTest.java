package testcode;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import businesscode.Calculator;
public class CalculatorTest {

	private Calculator calc;
	
	/*@Before annotation in JUnit is used on a method containing Java code to run before each test case. i.e it runs before each test execution.*/
	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}
	/*@After annotation is used on a method containing java code to run after each test case. These methods will run even if any exceptions are thrown in the test case or in the case of assertion failures.*/
	@After
	public void tearDown() throws Exception {
	calc=null;
	}

	@Test
	public void testAdd() {
	assumeTrue(5>10);
		double result=calc.add(10.50,20.43 );
		assertEquals(30.93,result,0);
	
	}

	@Test
	public void testSubtract() {
		assumeFalse(5<1);
		double result=calc.subtract(20.50,10.43 );
		assertEquals(10.07,result,0);
		}

	@Test
	public void testMultiply() {
		double result=calc.multiply(10,20 );
		assertEquals(200,result,0);
		}

	@Test
	public void testDivide() {
		double result=calc.divide(100,20 );
		assertEquals(5,result,0);
		}
	
	@Test(expected=ArithmeticException.class)
	public void testDividebyzero() {
	calc.divide(100,0 );
		}

}
