package list13_02_03_04;

public abstract class Character {
	String name;
	int hp;

	public abstract void attack(Matango m);

	public void run() {
		System.out.println(this.name + "は逃げ出した");

	}

}
