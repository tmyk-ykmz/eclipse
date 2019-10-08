package test_extra03_05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int ans; 					// 進出した値を格納する変数
		int input;  				// 入力値を格納する変数
		int diff; 					// 進出値と入力値の差を格納する変数
		boolean judge = false; 	// 正解したらtrueに変更
		int count; 					// 回数を格納する変数

		// 10～99の乱数を1つ進出
		ans = new java.util.Random().nextInt(90) + 10;
		System.out.println("正解 : " + ans);  // 動作確認用正解表示

		// 回数の初期化
		count = 1;

		do {
			// 数値を入力
			System.out.print("10～99までの数値　＞");
			input = new java.util.Scanner(System.in).nextInt();
			// 進出値と入力値の差を算出
			diff = input - ans;

			// 差に対してif でヒントの表示を場合分け
			if (diff >= 50) {
				System.out.println("もっと小さく！");
			} else if (diff >= 25) {
				System.out.println("小さく");
			} else if (diff >= 10) {
				System.out.println("もう少し小さく");
			} else if (diff == 0) {
				System.out.println("正解");
				System.out.println(count + "回で当たり");
				judge = true;
			} else if (diff > -10) {
				System.out.println("あとちょっと大きく");
			} else if (diff > -25) {
				System.out.println("もう少し大きく");
			} else if (diff > -50) {
				System.out.println("大きく");
			} else {
				System.out.println("もっと大きく！");
			}

			// 10の位が同じ
			if ((ans / 10) == (input / 10) && judge != true) {
				System.out.println("10の位が同じです");
			}
			// 1の位が同じ
			if (ans % 10 == input % 10 && judge != true) {
				System.out.println("1の位が同じです");
			}

			// 回数を更新
			count++;

		} while (judge != true);

	}

}
