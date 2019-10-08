package list09_05_06;

public class Wizard {
	String name;
	int hp;

	void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のＨＰを10回復した！" + "HP:" + h.hp);
	}

}
