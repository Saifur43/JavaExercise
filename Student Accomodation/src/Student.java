
public class Student {
	String name;
	String address;
	String p_number;
	
	public Student(){}
	public Student(String name, String address, String p_number){
		this.name = name;
		this.address = address;
		this.p_number = p_number;
	}
	String getName(){
		return name;
	}
	String getAdd(){
		return address;
	}
	String getPN(){
		return p_number;
	}

}
