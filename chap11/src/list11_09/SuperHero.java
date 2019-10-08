package list11_09;

public class SuperHero extends Hero {
	private boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println(this.getName() + "は飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println(this.getName() + "は着地した！");
	}

	public void run() {
		System.out.println(this.getName() + "は撤退した！");
	}

	public void attack(Matango m) {
		super.attack(m);
		//		System.out.println(this.getName() + "の攻撃！");
		//		m.hp -= 5;
		//		System.out.println("　5ポイントのダメージをあたえた！");
		if (this.flying) {
			super.attack(m);
			//			System.out.println(this.getName() + "の追加攻撃！");
			//			m.hp -= 5;
			//			System.out.println("　5ポイントのダメージをあたえた！");
		}

	}

}
