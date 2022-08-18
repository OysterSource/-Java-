package pass14_02;
public class Range {
	// 最小値
	private double min;
	// 最大値
	private double max;

	//比較する値の範囲のコンストラクタ
	public Range(double min, double max) {
		//最小・最大値をコンストラクタの変数に設定する
		this.min = min;
		this.max = max;
	}

	// a が範囲内のとき true を返す
	public boolean maru(double a) {
		return a < max && a >= min ? true : false;
	}

	@Override
	// min と max の文字列を返す
	public String toString() {
		return "[min:" + min + " - max:" + max + "]";
	}

	//minの値を持ってくる
	public double getMin() {
		return min;
	}

	//引数の値をminにセットする
	public void setMin(double min) {
		this.min = min;
	}

	//maxの値を持ってくる
	public double getMax() {
		return max;
	}

	//引数の値をmaxにセットする
	public void setMax(double max) {
		this.max = max;
	}
}
