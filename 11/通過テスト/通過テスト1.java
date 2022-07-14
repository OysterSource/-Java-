package exercise;

import lib.Input;

public class 通過テスト1 {

	public static void main(String[] args) {
		//文字列で入力された商品コードを持ってくる
		String code = Input.getString("商品コード");
		//数字で入力された商品の数量を持ってくる
		int quantity = Input.getInt("数量");
		//各商品コードと紐づける値段を変数化する
		int price;
		//（　）内に書いた変数の値と同じラベル（case〇〇の部分）にジャンプする
		switch (code) {
		case "a100":
		case "b100":
			price = 100;
			//breakがあることでbreakの場所で脱出でき、自動で次の処理に行かないようにしている
			break;
		case "a110":
		case "b110":
		case "b120":
			price = 200;
			break;
		case "c100":
		case "c110":
			price = 300;
			break;
		case "d100":
			price = 400;
			break;
		//↑で設定されていない値が入力されると、default:以下に設定されている値が適用される
		default:
			price = 500;
			break;
		}
		//↑で入力された商品コードと数量を掛けて出した合計金額を出力する
		System.out.println("合計金額は" + quantity * price + "円です");
	}

}
