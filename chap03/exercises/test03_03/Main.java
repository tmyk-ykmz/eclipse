package test03_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int seibetu = new java.util.Random().nextInt(2);
		int age = new java.util.Random().nextInt(81) + 20;

		System.out.print("こんにちは。");

		if (seibetu==0) {
			System.out.println("私は男性です。");
			System.out.println(age + "歳です。");
			System.out.println("よろしくおねがいします。");
		}
			else {
				System.out.println("私は女性です。");
			}


	}

}
