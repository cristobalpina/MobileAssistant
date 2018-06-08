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
		String[] randomTitle = { "La nueva ola de sangucherías de Santiago",
				"Sebastián Piñera regresa a la presidencia chilena",
				"Cómo se creó la mayor red de parques nacionales en Suramérica",
				"Hacienda: A pesar de este incremento del IPC, la inflación se encuentra contenida",
				"Pronóstico de nieve en Santiago: Las medidas de Enel para evitar los cortes prolongados del año pasado",
				"Un 22% de los extranjeros que recibió una visa permanente en 2017 es profesional",
				"Trump y opción de indultarse a sí mismo: No estoy por encima de la ley" };
		int rnd = new Random().nextInt(randomTitle.length);
		return randomTitle[rnd];
	}
}
