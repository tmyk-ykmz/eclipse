package list15_03;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\data.txt");
			fw.write("hello!");
			fw.close();
		} catch (Exception e) { // 親クラスのExceptionを指定してエラーをザックリ捉える
			System.out.println("何らかのエラーが発生しました");
			e.printStackTrace();
		}
	}

}
