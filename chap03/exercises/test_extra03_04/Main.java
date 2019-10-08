package test_extra03_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 樹幹
		for (int i = 0; i < 5; i++) {
			// インデント
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			// 左半分
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			// 右半分
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			// 改行
			System.out.println();
		}
	// 枝下
		for (int i = 0; i < 3; i++) {
			// インデント
			for (int j = 0; j < 5; j++) {
				System.out.print(" ");
			}
			System.out.println("**");
		}
	// 地面
		for (int i = 0; i < 14; i++) {
			System.out.print("\"");
		}

	}

}
