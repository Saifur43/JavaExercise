
public class TestApp {

	public static void main(String[] args) {
		
		Author author = new Author("Saifur", "saifurrahmany43@gmail.com", "Male");
		Book book = new Book("Computer Programming", author, 140, 500);
		
		System.out.println("Book Name: " + book.get_name());
		System.out.println("Author Name: " + book.get_author());
		System.out.println("Price of the book : " + book.get_price());
		System.out.println("Available in Stock : " + book.get_stock());
		
	}

}
