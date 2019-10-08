package test12_01;

public class Computer extends TangibleAsset {
	private String makerName;

	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		// TODO 自動生成されたコンストラクター・スタブ
		this.makerName = makerName;

	}

	public String getMakerName() {
		return this.makerName;
	}

}
