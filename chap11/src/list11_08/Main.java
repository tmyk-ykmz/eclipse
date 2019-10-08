package list11_08;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		//		h.run();
		SuperHero sh = new SuperHero();
		Matango m = new Matango();
		//		sh.run();
		//		sh.slip();
		sh.fly();
		sh.attack(m);
		System.out.println("お化けキノコのHP：" + m.hp);

	}

}
