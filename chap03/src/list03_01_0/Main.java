package list03_01_0;

public class Main {

	public static void main(String[] args) {
		// TODO 天気による行動の変化をJavaで表したもの
		System.out.print("晴れならtrue　雨ならfalseを入力＞");
		boolean tenki = new java.util.Scanner(System.in).nextBoolean();


//		boolean tenki = false;
//		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		} else {
			System.out.println("DVDを見ます");
		}
	}

}
