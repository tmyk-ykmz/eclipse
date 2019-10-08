package list03_03;

public class Main {

	public static void main(String[] args) {
		// TODO 波カッコを省略した記述
		boolean tenki = true; // ここでtrueかfalseを代入
		if (tenki == true) { // 内容が2行なので波カッコは省略不可能
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");

		} else // １行しかないので波カッコは省略可能
			System.out.println("DVDを見ます");

	}

}
// ブロックの波カッコを省略することは推奨されない。
