
public class Quiz {
	String ques;
	String op1;
	String op2;
	String op3;
	String op4;
	int answer;
	
	Quiz(String q, String o1, String o2, String o3,	String o4, int ans){
		ques = q;
		op1 = o1;
		op2 = o2;
		op3 = o3;
		op4 = o4;
		answer = ans;	
	}
	void display(){
		System.out.println(ques);
		System.out.println("1. "+op1);
		System.out.println("2. "+op2);
		System.out.println("3. "+op3);
		System.out.println("4. "+op4);
	}
	
	int get_ans(){
		return answer;
	}
	
}
