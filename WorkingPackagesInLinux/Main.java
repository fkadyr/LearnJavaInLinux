
import java.util.Scanner;

import quadraticequation.QuadraticEquation;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите коэфициент а ");
		int a = scanner.nextInt();

		System.out.println("Введите коэфициент b ");
		int b = scanner.nextInt();

		System.out.println("Введите коэфициент c ");
		int c = scanner.nextInt();

		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		equation.decision();
	}
}
