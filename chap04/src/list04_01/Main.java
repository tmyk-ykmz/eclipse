package list04_01;

public class Main {

	public static void main(String[] args) {
		// TODO 点数管理プログラム
		int sansu = 20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int syakai = 80;

		int sum = sansu + kokugo + rika + eigo + syakai;

		int avg = sum / 5;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);

	}

}
