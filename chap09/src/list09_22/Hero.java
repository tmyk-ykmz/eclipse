package list09_22;

public class Hero {
	String name;
	int hp;
	static int money;

	Hero() {
		this.hp = 100;
//		money = 1000;
	}

	static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}

}
