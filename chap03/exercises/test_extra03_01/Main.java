package test_extra03_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < 3; i++) {
			System.out.print("整数を入力してください ＞");
			int num = new java.util.Scanner(System.in).nextInt();
			if (20 <= num && num <= 80) {
				System.out.println("OK です");
			}
			else {
				System.out.println("NG です");
			}
		}
		System.out.println("終了します");

	}

}
