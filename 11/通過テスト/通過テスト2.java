package exercise;

public class 通過テスト2 {

	public static void main(String[] args) {
		// 変数valを宣言し、変数に配列を入れる
		int[] val = { 10, -12, 5, -12, 12, 25 };
		//拡張for文for (変数宣言 : 参照変数名)で配列から全要素を順番に取り出して直下で指示した処理を繰り返し行う
		for(int value : val) {
			//配列から取り出してきた要素がマイナスだったら																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
			if(value < 0) {
				//処理の結果がマイナスだったら負の値ですと出力する
				System.out.println("負の値です");
				//↑の場合計算処理をキャンセルする
				continue;
			}
			////配列要素の平方根の計算結果を出力する
			System.out.println(Math.sqrt(value));

		}

	}

}