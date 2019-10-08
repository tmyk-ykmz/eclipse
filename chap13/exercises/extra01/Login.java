package extra01;

import java.util.Scanner;

public class Login {
	String[] idList = { "tanaka", "yamada" }; // 正規ユーザーリスト
	String uid; // ログインユーザー名
	// ユーザー名を入力

	public void getInfo() {
		System.out.print("ユーザー名　＞");
		uid = new Scanner(System.in).nextLine();
	}

	// ユーザー名を認証
	public boolean isUser() {
		for (int i = 0; i < idList.length; i++) {
			if (uid.equals(idList[i])) {
				return true;
			}

		}
		return false;
	}

}
