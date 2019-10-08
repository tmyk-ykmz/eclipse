package test_extra02_06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("身長を入力＞");
		double height = new java.util.Scanner(System.in).nextDouble();

		System.out.print("体重を入力＞");
		double weight = new java.util.Scanner(System.in).nextDouble();

		System.out.println("身長＞" + height + "cm");
		System.out.println("体重＞" + weight + "kg");

		double m = height / 100;  //メートル変換
		double M = m * m;  //二乗計算
		double Bmi = weight / M; //BMI計算


		System.out.println("BMI＞" + Bmi);


	}

}
