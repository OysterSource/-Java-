package pass13_01;
//伝票クラスの宣言
public class Denpyo {
	//フィールド変数の宣言
	String date;
	String item;
	int price;
	int number;

	//dispメソッドでフィールド変数(クラス内で使う変数)をコンソールに表示する
	public void disp() {
		//日付・項目・単価・」個数を出力する
		System.out.println(date + "/" + item + "/" + price + "/" + number);
	}
}