package discriminant;


import java.util.logging.Logger;

public class Discriminant{

	public static final Logger logger = Logger.getLogger(Discriminant.class.getName());

	public static int equation(int a, int b, int c) {
        	logger.info("Вычесляем дискриминант!");
        	int D = (b*b) - (4 * a * c);
        	assert -1 < D : "Корней нет";
		logger.info("D = " + D);
        	return D;
    	}

   	public static void roots(int a, int b, int D) {
        	logger.info("Вычесляем корни уровнения!");
        	if (D > 0) {
            		logger.info("x1 = " + ((-b + Math.sqrt(D))/(2*a)));
            		logger.info("x2 = " + ((-b - Math.sqrt(D))/(2*a)));
        	} else {
            		logger.info("x = " + (-b / (2 * a)));
        	}
    	}
}
