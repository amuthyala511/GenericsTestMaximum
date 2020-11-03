package com.blz.generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaximumFloatTest {
	static MaximumFloat obj;
	@BeforeClass
	public static void maxFloatObj()
	{
		obj = new MaximumFloat();
	}
	
	// TestCase 2.1
	@Test
	public void givenValue_whenMaximum_AtFirstPosition_ReturnsTrue() {
		boolean max = obj.firstMax(41.5, 36.9, 25.7);
		Assert.assertEquals(max, true);
	}
	@Test
	public void givenValue_whenNotMaximum_AtFirstPosition_ReturnsFalse() {
		boolean max = obj.firstMax(41.5, 36.9, 55.7);
		Assert.assertEquals(max, false);
	}
	
	//TestCase 2.2
	@Test
	public void givenValue_whenMaximum_AtSecondPosition_ReturnsTrue() {
		boolean max = obj.secondMax(41.5, 54.8, 25.7);
		Assert.assertEquals(max, true);
	}
	@Test
	public void givenValue_whenNotMaximum_AtSecondPosition_ReturnsFalse() {
		boolean max = obj.secondMax(51.5, 34.8, 65.7);
		Assert.assertEquals(max, false);
	}
	
	//TestCase 2.3
	@Test
	public void givenValue_whenMaximum_AtThirdPosition_ReturnsTrue() {
		boolean max = obj.thirdMax(41.5, 36.9, 68.2);
		Assert.assertEquals(max, true);
	}
	@Test
	public void givenValue_whenNotMaximum_AtThirdPosition_ReturnsFalse() {
		boolean max = obj.thirdMax(41.5, 76.9, 68.2);
		Assert.assertEquals(max, false);
	}
}
