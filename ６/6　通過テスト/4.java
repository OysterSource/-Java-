package exercise;

public class Q04 {

	public static void main(String[] args) {
		// ここにコードを挿入
		int kei;
		int[] n1 = { 12, 11, 31, 51, 72 };
		int[] n2 = { 26, 14, 12, 22, 12 };
		for(int i = 0; i < 5; i++) {
			kei = n1[i] + n2[i];
			System.out.println("n1[" + i + "]+n2[" + i + "]=" + kei);

		}
	}
}
