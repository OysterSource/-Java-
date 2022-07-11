package exercise;

import lib.Input;

public class 練習2 {

	public static void main(String[] args) {
		// ここにコードを挿入
		int nin = Input.getInt();
		int ryokin = nin * 850;
		if(nin >= 5)
			ryokin *= 0.7;
		System.out.println("入館料＝" + ryokin);
	}
}
