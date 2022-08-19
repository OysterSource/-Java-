package pass17_01;

public class Exec {

	public static void main(String[] args) {
		// 配列の中身
		double[] data = { 65.1, 60, 3, 75.5, 70.0, 67.2 };
		//コンストラクタで変数を初期化
		Stat stat = new Stat(data);
		//最小・最大値を出力する
		System.out.println("最小値=" + stat.min() + "     " + "最大値=" + stat.max());
		//合計・平均を出力する
		System.out.println("合計=" + stat.sum() + "     " + "平均=" + stat.average());
	}
}
