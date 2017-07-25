
public class Author {

	private String name;
	private String email;
	private String gender;
	
	public Author(String name, String email, String gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
		
	}
	
	String get_name(){
		return name;
	}
	
	void display(){
		System.out.println("Author Name: " + name);
		System.out.println("Author email: " + email);
		System.out.println("Author gender: " + gender);
	}

}