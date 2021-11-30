package com.coforge.training.mockitoDemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
public class HelloWorld {

	@Test
	public void greetTest()
	{
		IDemo d=mock(IDemo.class);//create mock object of IDemo
		
		//style of representing the test
		//when-used to specify the behavior
		//then-used to describe the changes you expect by specified behavior
		when(d.greet()).thenReturn(IDemo.S);
		System.out.println("Demo Greets :"+d.greet());
	
	assertEquals(d.greet(), IDemo.S);
	}
}
