package com.blz.generics;

public class MaximumInteger
{
	public boolean firstMax(Integer a, Integer b, Integer c)
	{
		if (a.compareTo(b) > 0 && a.compareTo(c) > 0 )
			return true;
		else
			return false;
	}
	public boolean secondMax(Integer a, Integer b, Integer c)
	{
		if (b.compareTo(a) > 0 && b.compareTo(c) > 0 )
			return true;
		else
			return false;
	}
	public boolean thirdMax(Integer a, Integer b, Integer c)
	{
		if (c.compareTo(a) > 0 && c.compareTo(b) > 0 )
			return true;
		else
			return false;
	}
}
