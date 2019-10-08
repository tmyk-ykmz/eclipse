package test_extra02_03;

public class Main {

	public static void main(String[] args) {
		// TODO 第2章小3
		System.out.print("名字を入力＞");
		String Lname = new java.util.Scanner(System.in).nextLine();
		System.out.print("名前を入力＞");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("[名字]＞" + Lname);
		System.out.println("[名前]＞" + name);
		System.out.println(Lname +"　" + name);

	}

}
