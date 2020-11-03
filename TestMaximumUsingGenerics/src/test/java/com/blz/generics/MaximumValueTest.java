package com.blz.generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaximumValueTest {
	static MaximumValue m;

	@BeforeClass
	public static void maxIntegerObj() {
		m = new MaximumValue();
	}

	//TestCase 1.1
	@Test
	public void givenInteger_whenMaximum_AtFirstPosition_ReturnsSame() {
		int result = (Integer) m.testMaximum(50, 20, 40, 30);
		Assert.assertEquals(result, 50);
	}
	//TestCase 1.2
	@Test
	public void givenInteger_whenMaximum_AtSecondPosition_ReturnsSamee() {
		int result = (Integer) m.testMaximum(50, 60, 40, 30);
		Assert.assertEquals(result, 60);
	}
	//TestCase 1.3
	@Test
	public void givenInteger_whenMaximum_AtThirdPosition_ReturnsSame() {
		int result = (Integer) m.testMaximum(50, 40, 60, 80);
		Assert.assertEquals(result, 80);
	}
	
	//TestCase 2.1
	@Test
	public void givenFloat_whenMaximum_AtFirstPosition_ReturnsSame() {
		float result = (Float) m.testMaximum(52.3f, 21.2f, 44.6f, 38.0f);
		Assert.assertEquals(result, 52.3f, 0.0f);
	}
	//TestCase 2.2
	@Test
	public void givenFloat_whenMaximum_AtSecondPosition_ReturnsSamee() {
		float result = (Float) m.testMaximum(50.3f, 60.5f, 45.1f, 37.4f);
		Assert.assertEquals(result, 60.5f, 0.0f);
	}
	//TestCase 2.3
	@Test
	public void givenFloat_whenMaximum_AtThirdPosition_ReturnsSame() {
		float result = (Float) m.testMaximum(50.4f, 45.1f, 62.6f, 89.8f);
		Assert.assertEquals(result, 89.8f, 0.0f);
	}
	
	//TestCase 3.1
	@Test
	public void givenString_whenMaximum_AtFirstPosition_ReturnsSame() {
		String result = (String) m.testMaximum("Peach", "Orange", "Apple", "Banana");
		Assert.assertEquals(result, "Peach");
	}
	//TestCase 3.2
	@Test
	public void givenString_whenMaximum_AtSecondPosition_ReturnsSamee() {
		String result = (String) m.testMaximum("Modi", "Trump", "Obama", "Putin");
		Assert.assertEquals(result, "Trump");
	}
	//TestCase 3.3
	@Test
	public void givenString_whenMaximum_AtThirdPosition_ReturnsSame() {
		String result = (String) m.testMaximum("Cap", "Cloth", "Cover", "Lid");
		Assert.assertEquals(result, "Lid");
	}

}
