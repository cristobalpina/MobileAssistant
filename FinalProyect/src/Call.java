import java.util.Random;

public class Call extends Notification {
	private String from;

	public Call() {
		super();
		this.from = this.getRandomFrom();
	}
	public Call(String from) {
		super();
		this.from = from;
	}

	public String getFrom() {
		return this.from;
	}

	public void display() {
		System.out.println("display Call");
	}

	public String getRandomFrom() {
		String[] options = { "Javier Salas", "Romina Gil", "Raimundo Sanz", "Joaqu�n Calderon", "Beltran Larrain",
				"Tom�s Castro", "Mart�n Zamorano", "Mam�", "Pap�", "Max", "Toto", "Pancho" };
		int rnd = new Random().nextInt(options.length);
		return options[rnd];
	}
}
