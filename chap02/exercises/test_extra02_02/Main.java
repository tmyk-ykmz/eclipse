package test_extra02_02;

public class Main {

	public static void main(String[] args) {
		// TODO 第2章小2
		int p = 100;
		int i = 10;
		final double TAX = 1.08;// 税率は8でも0.08でも問題ない、使い方次第。
		int tax = (int)(TAX * 100 - 100);

		System.out.print("商品単価(税抜)  :  \\");System.out.println(p);
		System.out.print("個数            :  ");System.out.println(i + "個");
		System.out.print("消費税          :  ");System.out.println(tax + "%");
		System.out.println("----------------------------------");
		int M = (int)(p * i * TAX);
		System.out.print("金額(税込)      :  \\");System.out.println(M);

//		\tでタブを入力できる
//		\tならある程度の文字数変化にも対応できる
	}

}
