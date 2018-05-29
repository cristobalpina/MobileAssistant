
public class Mistery {
	public static int mistery(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0)
			return mistery(a + a, b / 2);
		return mistery(a + a, b / 2) + a;

	}

	public static void main(String[] args) {
		System.out.println(mistery(3, 11));
	}
}

