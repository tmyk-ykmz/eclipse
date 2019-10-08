package test_00;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		for (int i = 0; i < 9; i++) {
			System.out.println(count);
			for (int j = 0; j < 9; j++) {
				count++;
				System.out.println(count);
			}
			count++;System.out.println(count);
		}
		System.out.println(count);
	}

}
