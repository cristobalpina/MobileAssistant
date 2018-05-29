
public class Main {
	public static double factorial(int n) {
		double result = 1;
		for(int i = 1; i <= n; i++) {
			result = result*i;
		}
		return result;
	}
	public static void main(String[] args) {
		double factorial = Main.factorial(3);
		System.out.println(factorial);
	}
}

