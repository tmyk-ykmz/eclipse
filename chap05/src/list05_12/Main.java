package list05_12;

public class Main {

	// int型配列を受け取り、すべての要素を表示するメソッド
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = { 1, 2, 3 };
		printArray(array); // 配列を渡す

	}

}
