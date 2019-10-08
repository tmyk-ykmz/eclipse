package list04_09;

public class Main {

	public static void main(String[] args) {
		// TODO 配列とfor文
		int[] score = {20, 30, 40, 50, 80};
		for (int i = 0; i < score.length; i++) {
//								↑要素数が変わっても修正する必要がない
			System.out.println(score[i]);
		}

	}

}
