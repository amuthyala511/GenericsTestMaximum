package com.blz.generics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaximumValueTest {
	static MaximumValue m;
	@BeforeClass
	public static void maxValueObj()
	{
		m = new MaximumValue();
	}
	
	//TestCase 1.1
	@Test
	public void givenIntegerValue_whenMaximum_AtFirstPosition_ReturnsSame()
	{
		int result = (Integer) m.testMaximum(50, 42, 34, 25);
		Assert.assertEquals(result, 50);
	}
	
	//TestCase 1.2
	@Test
	public void givenIntegerValue_whenMaximum_AtSecondPosition_ReturnsSame()
	{
		int result = (Integer) m.testMaximum(50, 62, 34, 25);
		Assert.assertEquals(result, 62);
	}
		
	//TestCase 1.3
	@Test
	public void givenIntegerValue_whenMaximum_AtThirdPosition_ReturnsSame()
	{
		int result = (Integer) m.testMaximum(50, 42, 74, 25);
		Assert.assertEquals(result, 74);
	}
		
	//TestCase 2.1
	@Test
	public void givenFloatValue_whenMaximum_AtFirstPosition_ReturnsSame()
	{
		float result = (Float) m.testMaximum(50.1f, 42.4f, 34.7f, 25.3f);
		Assert.assertEquals(result, 50.1f, 0.0f);
	}
		
	//TestCase 2.2
	@Test
	public void givenFloatValue_whenMaximum_AtSecondPosition_ReturnsSame()
	{
		float result = (Float) m.testMaximum(50.1f, 62.0f, 34.3f, 25.5f);
		Assert.assertEquals(result, 62.0f, 0.0f);
	}
		
	//TestCase 2.3
	@Test
	public void givenFloatValue_whenMaximum_AtThirdPosition_ReturnsSame()
	{
		float result = (Float) m.testMaximum(50.1f, 42.4f, 74.5f, 25.6f);
		Assert.assertEquals(result, 74.5f, 0.0f);
	}
		
	//TestCase 3.1
	@Test
	public void givenValue_whenMaximum_AtFirstPosition_ReturnsSame()
	{
		String result = (String) m.testMaximum("Peach", "Apple", "Orange", "Banana");
		Assert.assertEquals(result, "Peach");
	}
	
	//TestCase 3.2
	@Test
	public void givenValue_whenMaximum_AtSecondPosition_ReturnsSame()
	{
		String result = (String) m.testMaximum("Modi", "Trump", "Obama", "Putin");
		Assert.assertEquals(result, "Trump");
	}
		
	//TestCase 3.3
	@Test
	public void givenValue_whenMaximum_AtThirdPosition_ReturnsSame()
	{
		String result = (String) m.testMaximum("Cap", "Helmet", "Mask", "Lid");
		Assert.assertEquals(result, "Mask");
	}
}
