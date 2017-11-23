
public class Student extends Person {
	int id;
	int year;

	Student(String n, String d, int i, int y) {
		super(n, d);
		id = i;
		year = y;
	}
	void display(){
		System.out.println("Name: " +name);
		System.out.println("Date Of Birth: " +dob);
		System.out.println("ID: " +id);
		System.out.println("Year: " +year);

	}
	
	String get_name(){
		return name;
	}
	
	int get_id(){
		return id;
	}

}
