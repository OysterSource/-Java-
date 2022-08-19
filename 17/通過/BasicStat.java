package pass17_01;
import java.util.Arrays;

public class BasicStat {
	//処理すべきデータ
	private double[] data;

	//配列データを受け取るコンストラクタ
	public BasicStat(double[] data) {
		this.data = data;
		//配列を昇順にソートする
		Arrays.sort(data);
	}

	//最小値を返す
	public double min() {
		return data[0];
	}

	//最大値を返す
	public double max() {
		return data[data.length - 1];
	}

	//データの個数を返す
	public int size() {
		return data.length;
	}

	//配列データを返す
	public double[] getData() {
		return data;
	}
}
