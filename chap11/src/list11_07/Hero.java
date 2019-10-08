package list11_07;

public class Hero {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name = "ミナト";
	private int hp = 100;

	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}

	// 逃げる
	public void run() {
		System.out.println(this.getName() + "は逃げ出した！");
	}

	public final void slip() {
		this.hp -= 5;
		System.out.println(this.getName() + "は転んだ！");
		System.out.println("5のダメージ");
	}

}
