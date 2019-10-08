package list15_01_02;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] arg) {
		try {
			// C:\Users\am\Documents\workspace\chap15 にdata.txtが作成される
			FileWriter fw = new FileWriter("C:\\data.txt");
			System.out.println("実行成功");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("エラーが発生しました");
			e.printStackTrace();
		}
	}

}
