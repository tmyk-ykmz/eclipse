package list03_02;

public class Main {

	public static void main(String[] args) {
		// TODO トレイの空きを待つ繰り返し処理
		System.out.print("トイレの空きは？　ある　ない");
		String doorOpen = new java.util.Scanner(System.in).nextLine();

		if (doorOpen == "ある") {
			System.out.println("入る");
		} else while (doorOpen == "ない"){
			System.out.println("待つ");



//		boolean doorClose = true;  //ここでtrueかfalseを代入
//		while (doorClose == true) {
//			System.out.println("ノックする");
//			System.out.println("1分待つ");

			break;
		}

	}

}
