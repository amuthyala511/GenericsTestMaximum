package com.blz.generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaximumStringTest {
	static MaximumString m;
	@BeforeClass
	public static void maxStringObj()
	{
		m = new MaximumString();
	}
	
	//TestCase 3.1
	@Test
	public void givenValue_whenMaximum_AtFirstPosition_ReturnsTrue() {
		boolean max = m.firstMax("Peach", "Apple", "Banana");
		Assert.assertEquals(max, true);
	}
	@Test
	public void givenValue_whenNotMaximum_AtFirstPosition_ReturnsFalse() {
		boolean max = m.firstMax("Apple", "Banana", "Peach");
		Assert.assertEquals(max, false);
	}
	
	//TestCase 3.2
	@Test
	public void givenValue_whenMaximum_AtSecondPosition_ReturnsTrue() {
		boolean max = m.secondMax("Banana", "Peach", "Apple");
		Assert.assertEquals(max, true);
	}
	@Test
	public void givenValue_whenNotMaximum_AtSecondPosition_ReturnsFalse() {
		boolean max = m.secondMax("Apple", "Banana", "Peach");
		Assert.assertEquals(max, false);
	}
	
	//TestCase 3.3
	@Test
	public void givenValue_whenMaximum_AtThirdPosition_ReturnsTrue() {
		boolean max = m.thirdMax("Apple", "Banana", "Peach");
		Assert.assertEquals(max, true);
	}
	@Test
	public void givenValue_whenNotMaximum_AtThirdPosition_ReturnsFalse() {
		boolean max = m.thirdMax("Apple", "Peach", "Banana");
		Assert.assertEquals(max, false);
	}

}
