package exercise;

import lib.Input;

public class 練習4 {

	public static void main(String[] args) {
		// ここにコードを挿入
		int postage;
		double weight = Input.getDouble();
		if(weight < 1) {
			postage = 300;
		} else if(weight < 5) {
			postage = 500;
		} else if(weight < 10) {
			postage = 800;
		} else {
			postage = 1500;
		}
		System.out.println("送料は" + postage + "円");
	}
}
