public class Main {
	public static double power(double x, int n) {
		double result = x;
		for(int i = 1; i < n; i++) {
			result = result*x;
		}
		return result;
	}

	public static void main(String[] args) {
		double power = Main.power(3, 3);
		System.out.println(power);
	}
}

