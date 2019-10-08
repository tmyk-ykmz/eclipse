package test11_3;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		PoisonMatango pm = new PoisonMatango('A');
		System.out.println(h.getName() + "のHP：" + h.getHp());

		pm.attack(h);
		//		System.out.println(pm.poison);
		System.out.println(h.getName() + "のHP：" + h.getHp());

	}

}
