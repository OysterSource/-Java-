package exercise;

public class 練習2 {

	public static void main(String[] args) {
		//メソッドを呼び出す 
		greet("田中宏", 1);
	}

	//メソッドの処理を作る
	public static void greet(String name, int sex) {
		//性別が1と入力されたらこんにちはname くんと出力する
		if(sex == 1) {
			System.out.print("こんにちは" + name + "くん");
			//それ以外の数字が入力されたらこんにちはnameさんと出力する
		} else {
			System.out.print("こんにちは" + name + "さん");
		}
	}
}
