package exercise;

import lib.Input;

public class 通過テスト3 {

	public static void main(String[] args) {
		// ここにコードを挿入
		int cmd;
		do {
			System.out.println(Math.random());
			cmd = Input.getInt();
		} while(cmd == 1);

	}

}
