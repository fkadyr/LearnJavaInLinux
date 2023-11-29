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


	public void decision() {
		Discriminant.roots(this.a, this.b, Discriminant.equation(this.a, this.b, this.c));
    	}
}

