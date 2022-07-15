package exercise;

import lib.Input;

public class 練習3 {

	public static void main(String[] args) {
		//入力された値を変数tankaに格納する
		int tanka = Input.getInt("単価");
		//入力された値を変数rituに格納する
		double ritu = Input.getDouble("税率");
		//税額を出力する
		System.out.print("税額は" + tax(tanka, ritu) + "円");

	}

	//入力され単価と税率から計算された税額の値を返す
	public static int tax(int tanka, double ritu) {
		// 単価と税率を掛けて出された税額をint型にキャストしてリターンする
		return (int) (tanka * ritu);
	}

}
