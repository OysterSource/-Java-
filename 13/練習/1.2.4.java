package ex13_01_1;
//カードクラスを宣言
public class Card {
	//カードの種類の値を文字列のフィールド変数化
	String suit;
	//カードの番号の値を数列のフィールド変数化
	int number;

	//dispメソッドでフィールド変数(クラス内で使う変数)をコンソールに表示する
	public void disp() {
		//カードの種類を出力する
		System.out.println("種類＝" + suit);
		//カードの番号を出力する
		System.out.println("番号＝" + number);

	}

}
