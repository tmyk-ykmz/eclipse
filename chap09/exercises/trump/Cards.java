package trump;

public class Cards {
	// トランプ配列
	int[] cards;

	//  配列の値
	//  000 : ジョーカー
	//  101～113 : スペードの1～13
	//  201～213 : ハートの1～13
	//  301～313 : ダイヤの1～13
	//  401～413 : クラブの1～13

	// コンストラクタ
	public Cards() {
		// 配列を作成
		this.cards = new int[13 * 4 + 1];

		// 初期化
		organize();
	}

	// トランプの整列
	public void organize()	{
		// ジョーカーを格納
		this.cards[0] = 0;

		for(int i = 1; i <= 13; i++) {
			// スペードを格納（添え字：1～13）
			this.cards[i] = 100 + i;

			// ダイヤを格納（添え字：14～26）
			this.cards[i + 13] = 300 + i;

			// クラブを格納（添え字：27～39）
			this.cards[i + 26] = 400 + i;

			// ハートを格納（添え字：40～52）
			this.cards[i + 39] = 200 + i;
		}
	}

	// トランプのシャッフル
	public void shuffle() {
		for(int i = 0; i < this.cards.length; i++ ) {
			// 0～52の乱数を発生
//			int rnd = new java.util.Random().nextInt(53);	// Randomクラス
			int rnd = (int)(Math.random() * 53);			// Mathクラスのrandom()

			// cards[i]とcards[rnd]を入れ替える
			int tmp = this.cards[i];
			this.cards[i] = this.cards[rnd];
			this.cards[rnd] = tmp;
		}
	}

	// トランプの取得
	public int getCard(int num) {
		// カードを戻す
		return this.cards[num - 1];
	}

}
