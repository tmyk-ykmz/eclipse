package test12_01;

public class TangibleAsset {

	private String name;
	private int price;
	private String color;

	// コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	// getterメソッド

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

}
