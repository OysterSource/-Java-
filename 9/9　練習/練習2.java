package exercise;

import lib.Input;

public class 練習2 {

	public static void main(String[] args) {
		// ここにコードを挿入
		double x;
		while((x = Input.getDouble()) != 0) {
			System.out.println(Math.sqrt(x));
		}
	}
}
