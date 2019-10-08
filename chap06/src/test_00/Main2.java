package test_00;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < 5; i++) {
//			System.out.println("i =" + i);
			for (int j = 0; j < 5; j++) {

				if (i * j % 2 == 1) {
					System.out.println("j i" + j + "　" + i);
					System.out.println("hello");
					break;
				}
			}
		}

	}

}

