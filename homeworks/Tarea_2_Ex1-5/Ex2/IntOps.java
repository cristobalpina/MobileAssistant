
public class IntOps {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt("0");
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
		int prod = a * b;
		System.out.println(a + " * " + b + " = " + prod);
		if (b != 0) {
			int quot = a / b;
			System.out.println(a + " / " + b + " = " + 
quot);
		} else {
			System.out.println("Division by zero");
		}
		if (b != 0) {
			int rem = a % b;
			System.out.println(a + " % " + b + " = " + rem);
		} else {
			System.out.println("Division by zero");
		}
		
	}
}

