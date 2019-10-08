package test_extra03_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i = 0; // 合計値
		int j = 0; // 処理回数
		for (;;) {
			if (i >= 100) { // 平均値ブロック
				System.out.println("入力された平均値：" + i / j);
				break;
			}
			else { // 入力ブロック
				System.out.print("正の整数 ＞");
				int num = new java.util.Scanner(System.in).nextInt();
			if (num > 0) { // 整数判定、回数カウント
				j++;
				i += num;
			}
			else {
				System.out.println("正の整数ではありません");
			}
			}
		}
	}
}
