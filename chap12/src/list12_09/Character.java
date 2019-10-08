package list12_09;

public abstract class Character { // 抽象クラス
	String name;
	int hp;

	public void run() {
		System.out.println(this.name + "は逃げ出した");

	}

	public abstract void attack(Matango m); // 抽象メソッド

}
