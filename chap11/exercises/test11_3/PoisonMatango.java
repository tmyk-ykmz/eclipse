package test11_3;

public class PoisonMatango extends Matango {
	public PoisonMatango(char suffix) {
		super(suffix);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private String name = "お化け毒キノコ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//	private int poison = 5; //毒攻撃回数
	int poison = 5;

	public void attack(Hero h) {
		super.attack(h);
		if (this.poison != 0) {
//		if (this.poison > 0)
			System.out.println(this.getName() + "はさらに毒の胞子をばらまいた！");
			int dmg = h.getHp() / 5;
			h.setHp(h.getHp() - dmg);
			System.out.println(h.getName() + "に" + dmg + "ポイントのダメージ");
			this.poison--;

		}
	}
}
