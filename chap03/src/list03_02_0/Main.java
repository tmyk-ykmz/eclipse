package list03_02_0;

public class Main {

	public static void main(String[] args) {
		// TODO トレイの空きを待つ繰り返し処理
		System.out.print("トイレの空きは？　ある　ない\n＞");
		String doorOpen = new java.util.Scanner(System.in).nextLine();

		if (doorOpen.equals("ある")) {
			System.out.println("入る");
		} else while (doorOpen.equals("ない")){
			System.out.println("待つ");
//			equalsメソッド　文字列の比較




//		boolean doorClose = true;  //ここでtrueかfalseを代入
//		while (doorClose == true) {
//			System.out.println("ノックする");
//			System.out.println("1分待つ");

			break;
		}

	}

}
