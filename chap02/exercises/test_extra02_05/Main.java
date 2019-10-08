package test_extra02_05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("底辺を入力＞");
		double teihen = new java.util.Scanner(System.in).nextDouble();

		System.out.print("高さを入力＞");
		double height = new java.util.Scanner(System.in).nextDouble();

		int teihenI = (int) teihen;
		int heightI = (int) height;

		System.out.println("[底辺]＞" + teihenI);
		System.out.println("[高さ]＞" + heightI);

		System.out.println(
		"底辺" + teihen + "、" + "高さ" + height +
		"の面積は" + teihen * height / 2 + "です。"
		);

	}

}
