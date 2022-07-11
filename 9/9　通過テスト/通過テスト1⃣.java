package exercise;

import lib.Input;

public class 通過テスト5 {
	public static void main(String[] args) {
		// ここにコードを挿入
		String s;
		while((s = Input.getString()) != null) {
			System.out.println("<" + s.length() + ">");
			System.out.println(s);
		}
	}
}
