package com.blz.generics;

public class MaximumString {
	public boolean firstMax(String a, String b, String c) {
		return (a.compareTo(b) > 0 && a.compareTo(c) > 0 ? true : false);
	}

	public boolean secondMax(String a, String b, String c) {
		return (b.compareTo(a) > 0 && b.compareTo(c) > 0 ? true : false);
	}

	public boolean thirdMax(String a, String b, String c) {
		return (c.compareTo(a) > 0 && c.compareTo(b) > 0 ? true : false);
	}
}
