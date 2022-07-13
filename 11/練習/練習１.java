package exercise;

import lib.Input;

public class 練習１ {
	public static void main(String[] args) {
		// 処理結果で表示したいものを変数化
		String season;
		//入力された数字を抽出して変数monthに格納する
		int month = Input.getInt();
		{
			//入力された数字（月）に対応するcaseまでジャンプして処理を行う
			switch (month) {
			case 12:
				season = "冬";
				break;
			case 1:
				season = "冬";
				break;
			case 2:
				season = "冬";
				break;
			case 3:
				season = "春";
				break;
			case 4:
				season = "春";
				break;
			case 5:
				season = "春";
				break;
			case 6:
				season = "夏";
				break;
			case 7:
				season = "夏";
				break;
			case 8:
				season = "夏";
				break;
			case 9:
				season = "秋";
				break;
			case 10:
				season = "秋";
				break;
			case 11:
				season = "秋";

				break;
			//1~12以外の数字が入力されたときにエラー文である❓が選択される
			default:
				season = "?";
			}
			//結果を出力する
			System.out.println(season);
		}
	}
}
