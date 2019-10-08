package list01_02_double;

public class Main {

	public static void main(String[] args) {
		// 浮動小数点方式は「厳密な計算ができない」？
		double a = 0.1;
		double b = 0.2;
		double c;
		c = a + b;
		System.out.println("a + b = " + c);

		double A = 103;
//		103円だと誤差が出る

//		double A = 100;
//		100円だと誤差が出ない
		double B = 1.08;
		double C;
		C = A * B;
		System.out.println("A * B = " + C);
	}

}
