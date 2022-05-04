package math.java.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import math.java.project.AddNumber;

public class TestAddNumber {

	@Test
	
	public void testAdd() {
	
		AddNumber mathDemo = new AddNumber();
		
	int result = mathDemo.add(100,50);
	
	assertEquals(result,150);
	}
	
	public void testDiv() {
		
		AddNumber mathDemo1 = new AddNumber();
		
	int total = mathDemo1.div(100,50);
	
	assertEquals(result,2);
	}
}
