package list05_14;

public class Main {

	public static int[] makeArray(int size) { // int配列を作成して戻すメソッド
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray; // 配列を戻す
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = makeArray(3);
		for (int i : array) {			// arrayの全要素を出力
			System.out.println(i);		// arrayの全要素を出力
		}

	}

}
