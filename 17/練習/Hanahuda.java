package ex17_01_1;

class Card {
	public int number;
	public int suit;

	public Card(int number, int suit) {
		this.number = number;
		this.suit = suit;
	}
}

class Hanahuda extends Card {
	private int month;

	// 花札コンストラクタ
	public Hanahuda(int number, int suit, int month) {
		super(number, suit);
		this.month = month;
	}
}
