package exercise;

import lib.Input;

public class 練習5 {

	public static void main(String[] args) {
		// ここにコードを挿入
		int date, sanbai = 0, other = 0;
		while((date = Input.getInt()) != 0)
			if(date % 3 == 0) {
				sanbai++;
			} else {
				other++;
			}
		System.out.println("3の倍数は" + sanbai + "個");
		System.out.println("それ以外は" + other + "個");
	}
}
