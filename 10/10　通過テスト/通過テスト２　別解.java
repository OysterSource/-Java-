package exercise;

import lib.Input;

public class juju {

	public static void main(String[] args) {
		// ここにコードを挿入
		int postage, dis = 0;
		dis = Input.getInt("距離");
		if(dis < 50) {
			postage = 300;
		} else if(dis < 100) {
			postage = 500;
		} else if(dis < 500) {
			postage = 700;
		} else {
			postage = 1000;
		}
		System.out.println("送料は" + postage + "円です");
	}

}
