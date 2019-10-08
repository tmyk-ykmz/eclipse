package test04_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] num = {3, 4, 9};

			System.out.print("1桁の数字を入力してください＞");
			int input = new java.util.Scanner(System.in).nextInt();

			for (int n : num) {
				if (n == input) {
					System.out.println("アタリ");

				}
			}

	}

}
