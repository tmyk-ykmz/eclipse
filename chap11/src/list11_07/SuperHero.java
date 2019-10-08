package list11_07;

public class SuperHero extends Hero {
	private boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	public void run() {
		System.out.println("撤退した！");
	}

	public void attack(Matango m) {
		System.out.println(this.getName() + "の攻撃！");
		m.hp -= 5;
		if (this.flying) {
			System.out.println(this.getName() + "の攻撃！");
			m.hp -= 5;
			System.out.println("5ポイントのダメージをあたえた！");
		}

	}

}
