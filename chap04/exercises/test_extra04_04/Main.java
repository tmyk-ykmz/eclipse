package test_extra04_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] name = {"山田", "鈴木", "佐々木", "田中", "小林"};
		int[] age = {20, 37, 45, 31, 52};
		String[] home = {"東京", "神奈川", "東京", "埼玉", "埼玉"};

		System.out.println("会員住所検索");
		System.out.print("[検索したい住所]＞");
		String search = new java.util.Scanner(System.in).nextLine();

		System.out.println();

		System.out.println("会員ID\t氏名\t年齢\t住所");
		System.out.println("------------------------------------");
//		　↓何も入力せずにEnterを押した場合の条件
		if (search == null || search.equals("") || search.length() == 0) {
			for (int i = 0; i < name.length; i++) {
				System.out.print((i + 1) + "\t\t" + name[i] + "\t" + age[i]
									+ "\t\t" + home[i] + "\n");
			}
		}
		else {
			for (int i = 0; i < name.length; i++) {
				if (home[i].equals(search)) {
					System.out.print((i + 1) + "\t\t" + name[i] + "\t" + age[i]
										+ "\t\t" + home[i] + "\n");
				}
			}
		}




	}

}
