package FirstTask;

import quadraticequation.QuadraticEquation;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    	public static final Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

        	Scanner scanner = new Scanner(System.in);

        	System.out.println("Введите коэфициент a");
        	int a = scanner.nextInt();
        	System.out.println("Введите коэфициент b ");
        	int b = scanner.nextInt();
        	System.out.println("Введите коэфициент c ");
        	int c = scanner.nextInt();

        	QuadraticEquation equation = new QuadraticEquation(a, b, c);

       		equation.decision();

    	}
}
