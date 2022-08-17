package pass14_01;
public class HealthRecord {
	private String name; // 氏名
	private double height; // 身長（ m 単位）
	//

	public HealthRecord(String name, double height) {
		this.name = name;
		this.height = height;
	}

	// 身長のオーバーロード化
	public HealthRecord(double height) {
		this("", height);
	}

	// 標準体重の計算式のメソッド
	public double stdWeight() {
		return Math.pow(height, 2) * 22;
	}

	// toStringメソッド
	@Override
	public String toString() {
		return name + "/" + height + "m";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
