package ex13_01_1;
//カードクラスを宣言
public class Card {
	//カードの種類の値を文字列のフィールド変数化
	String suit;
	//カードの番号の値を数列のフィールド変数化
	int number;

	//dispメソッドを作成・呼び出された際に種類と番号を出力
	public void disp() {
		System.out.println("種類＝" + suit);
		System.out.println("番号＝" + number);
	}
}
