package list03_07_extra;

public class Main {

	public static void main(String[] args) {
		// TODO 無限ループ
		int i = 0; // for文の外で宣言
		for (;;) {
			if (i == 10) {
				break;
			}
		System.out.println("こんにちは");
		i++; // 変数の更新
		}

	}

}
