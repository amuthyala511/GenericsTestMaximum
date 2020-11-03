package com.blz.generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaximumIntegerTest {
	static MaximumInteger m;

	@BeforeClass
	public static void maxIntegerObj() {
		m = new MaximumInteger(null, null, null);
	}

	//TestCase 1.1
	@Test
	public void givenInteger_whenMaximum_AtFirstPosition_ReturnsSame() {
		int result = (Integer) m.max(50, 40, 30);
		Assert.assertEquals(result, 50);
	}
	//TestCase 1.2
	@Test
	public void givenInteger_whenMaximum_AtSecondPosition_ReturnsSamee() {
		int result = (Integer) m.max(50, 60, 30);
		Assert.assertEquals(result, 60);
	}
	//TestCase 1.3
	@Test
	public void givenInteger_whenMaximum_AtThirdPosition_ReturnsSame() {
		int result = (Integer) m.max(50, 60, 80);
		Assert.assertEquals(result, 80);
	}
	
	//TestCase 2.1
	@Test
	public void givenFloat_whenMaximum_AtFirstPosition_ReturnsSame() {
		float result = (Float) m.max(52.3f, 44.6f, 38.0f);
		Assert.assertEquals(result, 52.3f, 0.0f);
	}
	//TestCase 2.2
	@Test
	public void givenFloat_whenMaximum_AtSecondPosition_ReturnsSamee() {
		float result = (Float) m.max(50.3f, 60.5f, 37.4f);
		Assert.assertEquals(result, 60.5f, 0.0f);
	}
	//TestCase 2.3
	@Test
	public void givenFloat_whenMaximum_AtThirdPosition_ReturnsSame() {
		float result = (Float) m.max(50.4f, 62.6f, 89.8f);
		Assert.assertEquals(result, 89.8f, 0.0f);
	}
	
	//TestCase 3.1
	@Test
	public void givenString_whenMaximum_AtFirstPosition_ReturnsSame() {
		String result = (String) m.max("Peach", "Apple", "Banana");
		Assert.assertEquals(result, "Peach");
	}
	//TestCase 3.2
	@Test
	public void givenString_whenMaximum_AtSecondPosition_ReturnsSamee() {
		String result = (String) m.max("Modi", "Trump", "Putin");
		Assert.assertEquals(result, "Trump");
	}
	//TestCase 3.3
	@Test
	public void givenString_whenMaximum_AtThirdPosition_ReturnsSame() {
		String result = (String) m.max("Cap", "Cloth", "Lid");
		Assert.assertEquals(result, "Lid");
	}
}

