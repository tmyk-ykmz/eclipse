package test04_04_ans;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] nums = {3, 4, 9};

		boolean flag = false;

		System.out.println("1桁の数字を入力してください");

		int input = new java.util.Scanner(System.in).nextInt();

		for (int num : nums) {
			if (num == input) {
				System.out.println("アタリ");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("ハズレ");
		}

	}

}
