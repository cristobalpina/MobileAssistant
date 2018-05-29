public class Buzz {
	public static void baffle(String blimp) {
		System.out.println(blimp);
		zippo("ping", -5);
	}
	public static void zippo(String quince, int flag) {
		if (flag < 0) {
			System.out.println(quince + " zoop");
		} else {
			System.out.println("1 ik");
			baffle(quince);
			System.out.println("boo-wa-ha-ha");
		}
	}
	public static void main(String[] args) {
		zippo("2 rattle", 13);
		System.out.println("\n3.- Blimp is rattle");
		System.out.println("4.- Output is: \nik\nrattle\nping zoop\nboo-ha-ha");
	}
}