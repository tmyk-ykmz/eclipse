package list13_06_07;

public abstract class Character {
	String name;
	int hp;

	public abstract void attack(Matango m);

	public void run() {
		System.out.println(this.name + "は逃げ出した");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
