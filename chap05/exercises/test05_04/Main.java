package test05_04;

public class Main {

	public static double calcTriangleArea(double bottom, double height) {
		double ta = bottom * height / 2;
		return  ta;
		/* double area = bottom * height * 0.2;　←割り算より掛け算の方がよい
		 * return area;
		 */
	}

	public static double calcCircleArea(double radius) {
		double ca = radius * radius * 3.14;
		return ca;
		/* double area = radius * radius * 3.14;
		 * return area;
		 */
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double ta = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積" + ta + "㎠");

		double ca = calcCircleArea(5.0);
		System.out.println("円の面積" + ca + "㎠");

	}

}
