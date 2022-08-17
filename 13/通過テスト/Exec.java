package pass13_01;

public class Exec {

	public static void main(String[] args) {
		// denpyoのオブジェクトを作る
		Denpyo denpyo1 = new Denpyo();
		denpyo1.date = " 01-15";
		denpyo1.item = "パソコン";
		denpyo1.price = 50000;
		denpyo1.number = 1;
		//2つめのdenpyoのオブジェクトを作る
		Denpyo denpyo2 = new Denpyo();
		denpyo2.date = " 01-16";
		denpyo2.item = "コピー用紙";
		denpyo2.price = 600;
		denpyo2.number = 5;
		//dispメソッドでdenpyo1・denpyo2フィールド変数(クラス内で使う変数)内のデータををコンソールに表示する
		denpyo1.disp();
		denpyo2.disp();
	}

}
