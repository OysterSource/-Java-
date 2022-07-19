package ex13_01_1;

public class Exec {
	public static void main(String[] args) {
		//クラス名 変数名＝new  クラス名()でオブジェクトをつくる
		Card card = new Card();
		//種類の変数にスペードを代入
		card.suit = "スペード";
		//番号の変数に１を代入
		card.number = 1;
		//dispメソッドでフィールド変数(クラス内で使う変数)をコンソールに表示する
		card.disp();

	}

}
