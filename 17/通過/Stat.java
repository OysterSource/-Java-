package pass17_01;

public class Stat extends BasicStat {
	public Stat(double[] data) {
		super(data);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//合計のメソッド
	public double sum() {
		//合計の変数に初期値の設定
		double total = 0;
		//配列が入っているDataから値を１つずつ持ってくる
		for(double x : getData()) {
			//totalに合計した値を入れる
			total += x;
		}
		//合計の値を返す
		return total;
	}

	//平均のメソッド
	public double average() {
		//	合計の値を返し、値の個数で割る
		return sum() / size();
	}
}
