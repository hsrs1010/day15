package com.one;

import java.awt.Point;

class pointEq {
	int x, y;

	public pointEq(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object obj) {
		pointEq p = (pointEq) obj;
		if (x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		pointEq a = new pointEq(2, 3);
		pointEq b = new pointEq(2, 3);
		pointEq c = new pointEq(2, 3);
//		a=b;
//		System.out.println(a);
//		System.out.println(b);
		if (a == b)
			System.out.println("a==b");
		if (a.equals(b))
			System.out.println("a is equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");
	}
}
