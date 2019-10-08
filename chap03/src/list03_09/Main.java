package list03_09;

public class Main {

	public static void main(String[] args) {
		// TODO for文のループを２重にして九九の表を出力する

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j); // 掛け算の結果を出力
				System.out.print(" ");   // 空白を出力
			}
		System.out.println("");          // 改行を出力
		}

	}

}
