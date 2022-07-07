package exercise;

import lib.Input;

public class 練習3 {

	public static void main(String[] args) {
		// ここにコードを挿入
		int n = Input.getInt();
		String str = (n % 4 == 0 && n % 100 != 0) || n % 400 == 0 ? "うるう年です" : "平年です";
		System.out.println(str);

	}

}
