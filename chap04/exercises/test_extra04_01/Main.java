package test_extra04_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String [] name = {
		"田中", "前田", "鈴木", "中村", "田辺", "浦川", "島田", "岩田"};
		int [] sake = {7, 0, 3, 3, 2, 0, 0, 6};
		int [] tabaco = {60, 10, 0, 20, 10, 0, 30, 0};
		String level;
		System.out.println("名前（飲酒/日, 喫煙/本）発病危険度");
		System.out.println("----------------------------------");


		for (int i = 0; i < name.length; i++) {
			int s = sake[i];
			int t = tabaco[i];
			if (s == 0 && t == 0) {
				level = "安全";
			}
			else if (s == 0 && t <= 20) {
				level = "注意";
			}
			else if (s <= 3 && t == 0) {
				level = "注意";
			}
			else if (s <= 3 && t <= 20) {
				level = "要指導";
			}
			else {
				level = "要検査";
			}
		System.out.println(name[i] + "(\t" + s + "\t"
									+ ", \t" + t + "\t )" + "\t" + level);
		}


	}

}
