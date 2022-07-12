package exercise;

import lib.Input;

public class 通過テスト１ {

	public static void main(String[] args) {
		// ここにコードを挿入
		String eword, jword;
		while((eword = Input.getString()) != null) {
			if(eword.equals("dog")) {
				jword = "いぬ";
			} else if(eword.equals("cat")) {
				jword = "ねこ";
			} else if(eword.equals("mouse")) {
				jword = "ネズミ";
			} else if(eword.equals("rabbit")) {
				jword = "うさぎ";
			} else {
				jword = "?";
			}
			System.out.println(jword);
		}
	}
}
