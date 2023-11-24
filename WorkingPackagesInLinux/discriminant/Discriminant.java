package discriminant;

public class Discriminant {
	public static int equation(int a, int b, int c) {
		return (b*b) - (4*a*c);
	}

	public static void roots(int a, int b, int D) {
		if (D > 0) {
			System.out.println("x1 = " + ((-b + Math.sqrt(D)) / (2 * a)));
			System.out.println("x2 = " + ((-b - Math.sqrt(D)) / (2 * a)));
		} else if (D == 0) {
			System.out.println("x = " + (-b / (2 * a)));
		} else {
			System.out.println("Корней нет.");
		}
	}
}

