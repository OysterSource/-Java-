package exercise;

import lib.Input;

public class 練習3 {

	public static void main(String[] args) {
		// ここにコードを挿入
		int num = Input.getInt();
		if(num == 124) {
			System.out.println("大当たり");
		} else if(num == 123 || num == 125) {
			System.out.println("前後賞");
		} else {
			System.out.println("はずれ");
		}
	}
}
