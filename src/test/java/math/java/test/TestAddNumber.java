package math.java.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import math.java.project.AddNumber;

public class TestAddNumber {

	@Test
	
	public void testAdd() {
	
		AddNumber mathDemo = new AddNumber();
		
	int result = mathDemo.add(5,3);
	
	assertEquals(result,8);
	}
}
