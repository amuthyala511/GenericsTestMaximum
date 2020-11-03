package com.blz.generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaximumIntegerTest {
	static MaximumInteger m;

	@BeforeClass
	public static void maxIntegerObj() {
		m = new MaximumInteger();
	}

	@Test
	public void givenInteger_whenMax_AtFirstPosition_ReturnsSame() {
		boolean max = m.firstMax(50, 40, 30);
		Assert.assertEquals(max, true);
	}
	@Test
	public void givenInteger_whenMaximum_AtSecondPosition_ReturnsSame() {
		boolean max = m.secondMax(50, 60, 40);
		Assert.assertEquals(max, true);
	}
	@Test
	public void givenInteger_whenMaximum_AtThirdPosition_ReturnsSame() {
		boolean max = m.thirdMax(50, 60, 70);
		Assert.assertEquals(max, true);
	}
}
