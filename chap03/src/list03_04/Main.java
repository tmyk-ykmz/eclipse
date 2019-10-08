package list03_04;

public class Main {

	public static void main(String[] args) {
		// TODO 冗長でスッキリしないソースコード
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;


		if (fortune == 1)
		{
			System.out.println("大吉" + fortune);
		}else if (fortune == 2) {
			System.out.println("中吉" + fortune);
		} else if (fortune == 3) {
			System.out.println("吉" + fortune);
		} else {
			System.out.println("凶" + fortune);
		}
	}

}
