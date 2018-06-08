import java.util.Random;

public class News extends Notification {
	private String title;

	public News() {
		super();
		this.title = this.getRandomTitle();
	}

	public News(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void display() {
		System.out.println("display News");
	}

	public String getRandomTitle() {
		String[] randomTitle = { "La nueva ola de sangucher�as de Santiago",
				"Sebasti�n Pi�era regresa a la presidencia chilena",
				"C�mo se cre� la mayor red de parques nacionales en Suram�rica",
				"Hacienda: A pesar de este incremento del IPC, la inflaci�n se encuentra contenida",
				"Pron�stico de nieve en Santiago: Las medidas de Enel para evitar los cortes prolongados del a�o pasado",
				"Un 22% de los extranjeros que recibi� una visa permanente en 2017 es profesional",
				"Trump y opci�n de indultarse a s� mismo: No estoy por encima de la ley" };
		int rnd = new Random().nextInt(randomTitle.length);
		return randomTitle[rnd];
	}
}
