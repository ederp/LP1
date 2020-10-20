package ex2;

public class Calculo {
	
	public static double ExecutarCalculo(double num) {
		return Math.sqrt(num);
	}

	public static double ExecutarCalculo(double base, double expoente) {
		return Math.pow(base, expoente);
	}
	
	public static int ExecutarCalculo(int num) {
		int fatorial = num;
		for(int i = num - 1; i >= 2; i--) {
			fatorial *= i;
		}
		return fatorial;
	}
}
