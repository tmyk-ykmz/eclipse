package list13_02_03_04;

public class Exec {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Wizard w = new Wizard();
		Matango m = new Matango();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);

		Character c = w;
		c.name = "アサカ";
		c.attack(m);
//		c.fireball(m);

	}

}
