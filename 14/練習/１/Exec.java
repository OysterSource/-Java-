package ex14_01_1;

public class Exec {

	public static void main(String[] args) {
		// Cardのオブジェクトを作成
		Card card = new Card("スペード", 10);
		//faceメソッドをよびだしてコンソールに表示する
		System.out.println(card.face());
	}
}
