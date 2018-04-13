
public class Fermat {
	public static void checkFermat(int a, int b, int c, int n) {
		boolean works = Math.pow(a, n) + Math.pow(b, n) == Math.pow(c,  n);
		if(works) {
			System.out.println("Holy smokes, Fermat was wrong!");
			return;
		}
		System.out.println("No, that doesn't work");
	}
}
