package test12_01;

public class Book extends TangibleAsset {
	private String isbn;

	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		// TODO 自動生成されたコンストラクター・スタブ
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

}
