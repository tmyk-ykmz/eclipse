package test_extra04_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String [] name = {"山田", "上村", "鈴木", "田中", "高橋"};
		int [] score = {8, 3, 10, 7, 4};

		System.out.println("営業成約件数グラフ");
		System.out.println("氏名：成約件数");
		System.out.println("--------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + ":");

			for (int j = 0; j < score[i]; j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	}

}
