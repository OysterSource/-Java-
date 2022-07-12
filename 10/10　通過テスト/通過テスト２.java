package exercise;

import lib.Input;

public class 通過テスト２ {

	public static void main(String[] args) {
		// ここにコードを挿入
		int dist, postage = 0;
		dist = Input.getInt("距離");
		if(dist < 50)
			postage = 300;
		else if(dist < 100)
			postage = 500;
		else if(dist < 500)
			postage = 700;
		else
			postage = 1000;
		System.out.println("送料は" + postage + "円です");
	}
}
