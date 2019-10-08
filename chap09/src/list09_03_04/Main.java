package list09_03_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		// ↑swordフィールドに生成済みの剣インスタンス（番地）を代入

		System.out.println("現在の武器は" + h.sword.name);
		//								h勇者「の」s剣「の」n名前

	}

}
