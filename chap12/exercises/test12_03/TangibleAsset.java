package test12_03;

public class TangibleAsset extends Asset implements Thing {

	private String color;
	private double weight;

	// コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	// getterメソッド
	public String getColor() {
		return this.color;
	}



	// 確実にオーバーライドする手法として、@Overrideを付ける手法もある。
	// 正しくオーバーライドされていないと、抽象メソッドの場合は、
	// クラス名にエラー表示されるが、この場合はメソッド名にエラー表示される
	// ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	@Override
	public double getWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return this.weight;
	}

	@Override
	public void setWeight(double weight) {
		// TODO 自動生成されたメソッド・スタブ
		this.weight = weight;
	}

}
