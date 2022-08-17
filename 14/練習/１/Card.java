package ex14_01_1;

public class Card {
	String suit; // カードの種類 "スペード"、"ハート"、"クラブ"、"ダイヤ"
	int number; // カードの札番号 1～13

	//Cardのコンストラクタ化
	public Card(String suit, int number) {
		//どこのオブジェクトの変数かthis.で定義する
		this.suit = suit;
		this.number = number;
	}

	//faceが呼び出されたときreturnを返す
	public String face() { // カードを表す文字列を返す
		return suit + "/" + number;
	}
}
