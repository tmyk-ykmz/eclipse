package list01_05;

class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final double TAX = 1.08;
		int fax = 5;
		System.out.println("5万円から4万円に値下げします");
		//TAX = 4;
		fax = 4;
		System.out.println("ＦＡＸの新価格（税込み）");
		System.out.println(fax * TAX + "万円");
	}

}
