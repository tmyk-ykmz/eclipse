package test12_03;

public class Asset {
	private String name;
	private int price;

	// コンストラクタ
	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// getterメソッド

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
