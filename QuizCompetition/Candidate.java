
public class Candidate {
	String name;
	int id;
	int total_score;
	
	Candidate(Student s){
		name = s.get_name();
		id = s.get_id();
		total_score = 0;
	}
	
	void display(){
		System.out.println("Name: " +name);
		System.out.println("ID: " +id);
		System.out.println("Score: " +total_score);
	}
	
	void score(){
		total_score = total_score + 10;
	}

}
