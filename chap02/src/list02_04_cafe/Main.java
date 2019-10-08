package list02_04_cafe;

public class Main {

	public static void main(String[] args) {
		// TODO ++や--は、ほかの演算子と一緒に使わない
		int a = 10;
		int b = 10;
		System.out.println(++a + 50);
/*		 結果　61
 * 		1,変数aの値が1増える
 * 		2,それに50を加えたものが画面に表示される
 * 		　前置インクリメント：計算前に処理
 */

		System.out.println(b++ + 50);
/*		 結果　60
 *		1,変数bに50を加えたものが画面に表示される
 * 		2,変数bの値が1増える
 * 		　後置インクリメント：計算後に処理
 */

		System.out.println("a = " + a);
		System.out.println("a = " + b);
	}

}
