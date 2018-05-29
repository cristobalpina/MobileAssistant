public class Main {
	public static int countParethesesDifference(String s, String 
open, String close) {
		int n = s.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (c == '(') {
				count++;
			} else if (c == ')') {
				count--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "((3 + 7) * 2)";
		String open = "(";
		String close = ")";
		int result = countParethesesDifference(s, open, close);
		System.out.println(result);

	}
}

