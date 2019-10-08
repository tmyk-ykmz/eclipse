package list15_05;

public class Person {
	int age;

	public void setAge(int age) {
		if (age < 0) { // ここで引数をチェック
			throw new IllegalArgumentException("年齢は正の数を指定すべき。指定値＝" + age);

		}
		this.age = age; // 問題がないならフィールドに値をセット
	}

}
