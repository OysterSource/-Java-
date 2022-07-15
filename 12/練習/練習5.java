package exercise;

import lib.Input;

public class 練習5 {

	public static void main(String[] args) {
		// 個数に入力された値を持ってきて変数kosuに格納する
		int kosu = Input.getInt("個数");
		// 単価に入力された値を持ってきて変数tankaに格納する
		int tanka = Input.getInt("単価");
		// 総額の変数には、単価と個数を掛けたものを格納する
		int sougaku = tanka * kosu;
		// 変数rituに個数に応じた値引き率を格納する
		double ritu = nebikiRitu(kosu);
		// sougaku・rituに格納されている値を文字列で画面に表示する
		print(sougaku, ritu);

	}

	// 入力された個数に応じた値引き率を返す
	public static double nebikiRitu(int kosu) {
		// 個数が100個未満だった場合は値引き率0％
		double ritu;
		if(kosu < 100) {
			ritu = 0;
			// 個数が500個未満だった場合は値引き率5％
		} else if(kosu < 500) {
			ritu = 0.05;
			// 500以上の個数が入力された場合値引き率10％
		} else {
			ritu = 0.1;
		}
		// 個数に応じた値引き率の値を持ってリターンする
		return ritu;

	}

	// 入力された総額と値引き率の値を返す
	public static void print(int sougaku, double ritu) {
		// 総額（int型）に値引き率(double型)を掛けて出た値引き額をint型にキャストする
		int nebiki = (int) (sougaku * ritu);
		// 販売額を出力する
		System.out.println("販売額=" + sougaku + "円");
		// 値引き額を出力する
		System.out.println("値引き=" + nebiki + "円");
		// 売上を出力する
		System.out.println("売上=" + (sougaku - nebiki) + "円");
	}
}
