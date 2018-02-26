
public class Student {
	String name;
	String roll;
	String c1;
	double c1_mark;
	String c2;
	double c2_mark;
	String c3;
	double c3_mark;
	public Student(){}
	public Student(String name, String roll, String c1, double c1_mark, String c2, double c2_mark, String c3, double c3_mark){
		this.name = name;
		this.roll = roll;
		this.c1 = c1;
		this.c1_mark = c1_mark;
		this.c2 = c2;
		this.c2_mark = c2_mark;
		this.c3 = c3;
		this.c3_mark = c3_mark; 

	}
	String getName(){
		return name;
	}
	
	String getRoll(){
		return roll;
	}
	
	String getCourse1(){
		return c1;
	}
	
	String getCourse2(){
		return c2;
	}
	
	String getCourse3(){
		return c3;
	}
	
	double getMark1(){
		return c1_mark;
	}
	
	double getMark2(){
		return c2_mark;
	}
	
	double getMark3(){
		return c3_mark;
	}
}
