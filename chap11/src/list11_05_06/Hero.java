package list11_05_06;

public class Hero {
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
		System.out.println(this.name + "は逃げ出した！");
	}

}