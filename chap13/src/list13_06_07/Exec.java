package list13_06_07;

public class Exec {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero();
		h1.setName("勇者1番");
		Hero h2 = new Hero();
		h2.setName("勇者2番");
		Thief t1 = new Thief();
		t1.setName("盗賊1番");
		Wizard w1 = new Wizard();
		w1.setName("魔法１番");
		Wizard w2 = new Wizard();
		w2.setName("魔法２番");
		// 冒険開始！
		// まず宿屋に泊まる
		h1.setHp(h1.getHp() + 50);
		h2.setHp(h2.getHp() + 50);
		t1.setHp(t1.getHp() + 50);
		w1.setHp(w1.getHp() + 50);
		w2.setHp(w2.getHp() + 50);

	}

}
