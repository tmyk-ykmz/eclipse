package list13_08_09;



public class Exec {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Monster[] mons = new Monster[3];
		mons[0] = new Slime();
		mons[1] = new Goblin();
		mons[2] = new DeathBat();
		Character[] c = new Character[5];
		c[0] = new Hero(); //c[0].setName("勇者１");
		c[1] = new Hero(); //c[1].setName("勇者２");
		c[2] = new Thief(); //c[2].setName("盗賊２");
		c[3] = new Wizard(); //c[3].setName("魔法１");
		c[4] = new Wizard(); //c[4].setName("魔法２");
		String[] name = { "勇者１", "勇者２", "盗賊１", "魔法１", "魔法２" };
		//		for (Character ch : c) {
		//			ch.setName(name);
		//		}
		for (Monster m : mons) {
			m.run();
		}
	/*	for (Character ch : c) {
			ch.attack(mons);
		}*/

	}

}
