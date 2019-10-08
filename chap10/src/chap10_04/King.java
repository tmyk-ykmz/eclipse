package chap10_04;

public class King {
	void talk(Hero h) {
		System.out.println("王様：ようこそ我が国へ、勇者" + h.getName() + "よ");
		System.out.println("王様：長旅で疲れたであろう");
		System.out.println("王様：まずは城下町を見てくるよい。ではまた会おう");
		h.bye();
	}

}
