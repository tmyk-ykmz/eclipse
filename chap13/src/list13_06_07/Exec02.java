package list13_06_07;

public class Exec02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Character[] c = new Character[5];
		c[0] = new Hero();		//c[0].setName("勇者１");
		c[1] = new Hero();		//c[1].setName("勇者２");
		c[2] = new Thief();		//c[2].setName("盗賊２");
		c[3] = new Wizard();	//c[3].setName("魔法１");
		c[4] = new Wizard();	//c[4].setName("魔法２");
		String[] name = {"勇者１", "勇者２", "盗賊１", "魔法１", "魔法２"};
		// 宿屋に泊まる
		for (Character ch : c) {
			ch.setHp(ch.getHp() + 50);
		}

		System.out.println("HP状況");
		System.out.println(name[0] + "：" + c[0].getHp());
		System.out.println(name[1] + "：" + c[1].getHp());
		System.out.println(name[2] + "：" + c[2].getHp());
		System.out.println(name[3] + "：" + c[3].getHp());
		System.out.println(name[4] + "：" + c[4].getHp());

	}

}
