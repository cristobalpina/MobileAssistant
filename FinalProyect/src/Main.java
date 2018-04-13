import java.util.Scanner;


public class Main {
	private Assistant assistant;
	public Main() {
		this.assistant = new Assistant();
	}
	public void salute() {
		System.out.println("Hello Human.");
		System.out.println("I'm a phone simulator, I already have installed your assistant.");
		System.out.println("And it's ready to help you.");
	}
	
	public void displayOptions() {
		System.out.println("");
		System.out.println("What would you like me to do?");
		System.out.println("");
		System.out.println("1.- Simulate incoming call.");
		System.out.println("2.- Simulate incoming news.");
		System.out.println("3.- Turn off.\n");
	}
	
	public void exit() {
		System.out.println("Good Bye...");
		System.exit(0);
	}
	
	public void executeOptionSelected() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Select an option: ");
		int n = reader.nextInt();
		reader.close();
		switch(n) {
			case 1:
				this.assistant.getCall();
				break;
			case 2:
				this.assistant.getNews();
			case 3:
				this.exit();
		}
	}
	public static void main(String[] args) {
		Main phone = new Main();
		phone.salute();
		phone.displayOptions();
		phone.executeOptionSelected();

	}
}
