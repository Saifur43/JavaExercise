
public class Book {
	private String name;
	private Author author;
	private int price;
	private int stock;
	
	public Book(String name, Author author, int price, int stock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.stock = stock;
		
	}
	
	String get_name(){
		return name;
	}
	
	String get_author(){
		return author.get_name();
	}

	int get_price(){
		return price;
	}
	
	int get_stock(){
		return stock;
	}
}
