
public class Rational {
	private int numerator;
	private int denominator;

	public Rational() {
		this.numerator = 0;
		this.denominator = 1;
	}

	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public void printRational() {
		System.out.println(this.numerator + "/" + 
this.denominator);
	}
	public int getNumerator() {
		return this.numerator;
	}
	public int getDenominator() {
		return this.denominator;
	}
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	public void negate() {
		this.numerator = -1 * this.numerator;
	}

	public void invert() {
		int temp = this.numerator;
		this.numerator = this.denominator;
		this.denominator = temp;
	}

	public double toDouble() {
		return (double)this.numerator / (double) 
this.denominator;
	}
	
	public int greatestCommonDivisor() {
		int rem = this.numerator;
		int a = Math.abs(this.numerator);
		int b = Math.abs(this.denominator);
		int c = 0;
		while(rem != 0) {
			rem = a % b;
			c = a;
			a = b;
			b = rem;
		}
		return Math.abs(c / a);

	}
	public void add(Rational rational) {
		this.numerator = this.numerator + 
rational.getNumerator();
		this.denominator = this.denominator + 
rational.getDenominator();
		System.out.println(this.toString());
		int gcd = this.greatestCommonDivisor();
		System.out.println(gcd);
		this.numerator = this.numerator / gcd;
		this.denominator = this.denominator / gcd;
	}

	public static void main(String[] args) {
		Rational rational = new Rational(1071, 462);
		rational.printRational();
		System.out.println(rational.toString());
		//rational.negate();
		System.out.println(rational.toString());
		//rational.invert();
		System.out.println(rational.toString());
		System.out.println(rational.toDouble());
		System.out.println(rational.greatestCommonDivisor());
		Rational rational2 = new Rational(100, 1);
		rational.add(rational2);
		System.out.println(rational.toString());
	}
}

