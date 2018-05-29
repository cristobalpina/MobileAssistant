public class Big {
	public static BigInteger factorial(int x) {
		BigInteger result = new BigInteger("1");
		for (int i = 1; i <= x; i++) {
			result = result.multiply(new BigInteger(String.valueOf(i)));
		}
		return result;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			System.out.println("Factorial of " + i + " :" + factorial(i));
		}
	}
}

