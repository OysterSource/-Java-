package exercise;

import lib.Input;

public class 練習1 {

	public static void main(String[] args) {
		// ここにコードを挿入
		int year = Input.getInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("うるう年です");
		} else {
			System.out.println("うるう年ではありません");
		}
	}
}
