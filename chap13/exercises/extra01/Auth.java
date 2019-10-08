package extra01;

public class Auth {
	public void check(Login login) {
		login.getInfo();
		if (!login.isUser()) {
			System.out.print("Login failure.");
		} else {
			System.out.print("Welcome.");
		}
	}

}
