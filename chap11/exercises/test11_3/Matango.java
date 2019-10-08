package test11_3;

public class Matango {
	int hp = 50;
	private char suffix;
	private String name = "お化けキノコ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Matango(char suffix) {
		this.suffix = suffix;

	}

	public void attack(Hero h) {
		System.out.println(this.getName() + this.suffix + "の攻撃");
		System.out.println(h.getName() + "に10ポイントのダメージ");
		h.setHp(h.getHp() - 10);
	}

}
