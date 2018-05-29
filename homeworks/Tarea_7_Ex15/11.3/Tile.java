
public class Tile {
	private char letter;
	private int value;

	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}

	public char getLetter() {
		return this.letter;
	}

	public int getValue() {
		return this.value;
	}

	public void setLetter(char c) {
		this.letter = c;
	}

	public void setValue(int val) {
		this.value = val;
	}

	public static void printTile(Tile tile) {
		System.out.println("Tile letter: " + tile.getLetter());
		System.out.println("Tile value: " + tile.getValue());
	}

	public static void testTile() {
		Tile tile = new Tile('z', 10);
		printTile(tile);
		boolean equals = tile.equals(tile);
		System.out.println(equals);
		System.out.println(tile.toString());
	}

	public boolean equals(Tile tile) {
		if (this.value == tile.getValue() && this.letter == 
tile.getLetter()) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "letter: " + this.letter + "; value: " + 
this.value;
	}

	public static void main(String[] args) {
		testTile();
	}
}

