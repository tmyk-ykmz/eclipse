package list03_06;

public class Main {

	public static void main(String[] args) {
		// TODO あえてbreak文を書かない
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;

		switch (fortune) {
		case 1: // fortuneが1か2ならば
		case 2:
			System.out.println("いいね！" + fortune);
			break;

		case 3: // fortuneが3ならば
			System.out.println("普通です" + fortune);
			break;

		case 4: // fortuneが4か3ならば
		case 5:
			System.out.println("うーん・・・" + fortune);
		}

	}

}
