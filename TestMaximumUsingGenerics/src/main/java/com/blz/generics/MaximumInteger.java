package com.blz.generics;

import java.util.Comparator;

public class MaximumInteger<T extends Comparator<T>> {
	public static <T extends Comparable<T>> T max(T val1, T val2, T val3)
	{
		T max = val1;
		if (val2.compareTo(max) > 0)
			max = val2;
		if (val3.compareTo(max) > 0)
			max = val3;
		return max;
	}
}
