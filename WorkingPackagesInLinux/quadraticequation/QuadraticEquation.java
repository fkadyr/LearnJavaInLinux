package quadraticequation;

import discriminant.Discriminant;

public class QuadraticEquation {
	
	private int a;
	
	private int b;

	private int c;

	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public void decision() {
		Discriminant.roots(getA(), getB(), Discriminant.equation(getA(), getB(), getC()));
	}
}
