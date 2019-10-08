package test_extra04_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int number;		//個数
		int[] data;		//入力値
		int sum = 0;	//合計
		int ave;		//平均

		System.out.print("個数＞");
		number = new java.util.Scanner(System.in).nextInt();

		data = new int[number];

		for (int i = 0; i < number; i++) {
			System.out.print("data[" + i + "} >");
			data[i] = new java.util.Scanner(System.in).nextInt();
		}
		// 従来のfor文
//		for (int i = 0; i < number; i++) {
//			num += data[i];
//		}

		// 拡張for文
		for (int num: data) {
			sum += num;
		}

		ave = sum / data.length;

		System.out.println("dataの合計 = " + sum);
		System.out.println("dataの平均 = "+ ave);


	}

}
