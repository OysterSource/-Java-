package exercise;

public class 練習３ {

	public static void main(String[] args) {
		//元となるデータの配列を宣言
		double[] data = { 2.5, 3.3, 7.0, -4.5, 5.2 };
		//for (変数宣言 : 参照変数名)で配列から全要素を順番に取り出して直下で指示した処理を繰り返し行う
		for(double x : data) {
			//抽出した値が負の場合に不正と判断する
			if(x < 0) {
				//↑で判断された負の数を不正なデータ****として出力する
				System.out.println("不正なデータ:" + x);
				//for文を強制終了させループの外に出て次の処理へ行く
				break;
			}
			//配列要素の平方根の計算結果を出力する
			System.out.println(Math.sqrt(x));
		}
	}
}
