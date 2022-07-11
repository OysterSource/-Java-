package exercise;

import lib.Input;

public class 通過テスト2 {

	public static void main(String[] args) {
		// ここにコードを挿入
		double total = 0, value;
		int kensu = 0;
		while((value = Input.getDouble()) != 0) {
			total += value;
			kensu++;
		}
		System.out.println("合計=" + total);
		System.out.println("件数=" + kensu);
		System.out.println("平均=" + total / kensu);
	}
}
