package list09_03_04;

public class Hero {
	String name;
	int hp;
	Sword sword; // 勇者が装備している剣の情報

	void attack() {
		System.out.println(this.name + "は、攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}

}
