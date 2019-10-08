package test_04_01_s;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] name = { "山田", "鈴木", "佐々木", "田中", "小林" };
		int[] score = { 70, 67, 85, 100, 34 };
		int scoreM = 100;
		System.out.print("合格点を入力してください ＞");
		int tokuten = new java.util.Scanner(System.in).nextInt();
		double total = 0.0;

		System.out.println("テスト結果一覧表");
		System.out.println("満点：" + scoreM + "点　合格点：" + tokuten + "点以上");
		System.out.println("");
		System.out.println("番号\t氏名\t得点\t判定");
		System.out.println("------------------------------");
		for (int i = 0; i <= name.length - 1; i++) {
			String judge = score[i] >= tokuten ? "合格" : "不合格";
			System.out.println(
					(i + 1) + "\t\t" + name[i] + "\t" + score[i] + "\t\t" + judge);
			total += score[i];
		}
		System.out.println("");
		System.out.println("平均点：" + (total / name.length) + "点");

	}

}
