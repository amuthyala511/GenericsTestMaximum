package com.blz.generics;

public class MaximumFloat {
	public boolean firstMax(Double a, Double b, Double c) {
		return (a.compareTo(b) > 0 && a.compareTo(c) > 0 ? true : false);
	}

	public boolean secondMax(Double a, Double b, Double c) {
		return (b.compareTo(a) > 0 && b.compareTo(c) > 0 ? true : false);
	}

	public boolean thirdMax(Double a, Double b, Double c) {
		return (c.compareTo(a) > 0 && c.compareTo(b) > 0 ? true : false);
	}
}
