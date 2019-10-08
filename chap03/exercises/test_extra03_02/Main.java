package test_extra03_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 0;
		for (;;) {
			System.out.print("整数を入力してください ＞");
			String num = new java.util.Scanner(System.in).nextLine();
			if (num.equals("Fin")) {
				break;
			}
			else {
				int n = Integer.parseInt(num);

				if (20 <= n && n <= 80) {
					System.out.println("OK です");
				}
				else {
				System.out.println("NG です");
				}
			}
		}
		System.out.println("　--- End ---　");

	}

}
