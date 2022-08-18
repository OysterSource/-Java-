package pass14_02;

public class Exec {
	public static void main(String[] args) {
		//配列を作成
		double[] data = { 150.5, 75.1, 35.3, 281.2, 210.3 };
		//比較範囲を50.0から250.0の間に設定する
		Range range = new Range(50.0, 250.0);
		//data配列から要素を一つずつ取り出して、直下の処理にかける(拡張for文)
		for(double x : data) {
			System.out.println(x + "\t: " + range.maru(x));
		}
	}
}
