package list04_08;

public class Main {

	public static void main(String[] args) {
		// TODO 点数管理プログラム（配列版）
		int[] score = {20, 30, 40, 50, 80};
		int sum =
				score[1] + score[2] + score[3] + score[4] + score[5];
//		                                                    ↑存在しない要素
		int avg = sum / score.length;
		System.out.println("合計点：" + sum);
		System.out.println("平均点："+ avg);

	}

}
