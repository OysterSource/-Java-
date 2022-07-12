package exercise;

import lib.Input;

public class 通過テスト３ {

	public static void main(String[] args) {
		// ここにコードを挿入
		int month;
		String season;
		while((month = Input.getInt("月")) != 0) {
			if(month == 12 || month <= 2) {
				season = "冬";
			} else if(month <= 5) {
				season = "春";
			} else if(month <= 8) {
				season = "夏";
			} else if(month <= 11) {
				season = "秋";
			} else {
				season = "？";
			}
			System.out.println("季節は" + season + "です");
		}
	}
}